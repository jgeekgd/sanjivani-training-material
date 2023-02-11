package com.gd.client;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.dto.EmployeeProjectDto;
import com.gd.model.Employee;
import com.gd.model.Project;
import com.gd.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Employee emp1 = new Employee("Gd", "gd@gd.com", new Date(), 12000.00);
			Employee emp2 = new Employee("Maggi", "maggi@gd.com", new Date(), 32000.00);
			Employee emp3 = new Employee("Bill", "bill@gd.com", new Date(), 52000.00);

			Project project1 = new Project("CyberSecurity", "Defense", "USD",
					NumberFormat.getCurrencyInstance(Locale.US).format(2250000.00));
			Project project2 = new Project("Sapce Holiday", "SpaceX", "INR",
					NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(2250000.00));
			emp1.getProjects().add(project1);
			emp1.getProjects().add(project2);
			emp2.getProjects().add(project2);
			emp3.getProjects().add(project2);

			session.beginTransaction();
			Integer id = (Integer) session.save(emp1);
			System.out.println("Employee is created  with Id::" + id);
			Integer id2 = (Integer) session.save(emp2);
			System.out.println("Employee is created  with Id::" + id2);
			Integer id3 = (Integer) session.save(emp3);
			System.out.println("Employee is created  with Id::" + id3);
			session.getTransaction().commit();
			
			getAllEmployeeProjectDetails(session);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	private static List getAllEmployeeProjectDetails(Session session) {
		Query query = session.createNamedQuery("findAllEmployeeProjectMapping", EmployeeProjectDto.class);
		List results = query.getResultList();
		if (results.isEmpty())
			System.out.println("No Employee Found");
		else {
			for (Object currentRow : results) {
				System.out.println(currentRow);
			}
		}
		return results;
	}

}