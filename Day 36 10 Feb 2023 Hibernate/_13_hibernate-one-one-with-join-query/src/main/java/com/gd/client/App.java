package com.gd.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.dto.EmployeePancardDto;
import com.gd.model.Employee;
import com.gd.model.Pancard;
import com.gd.util.HibernateUtil;

public class App {

	public static void main(String[] args) throws ParseException {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Employee emp1 = new Employee("Gd", "gd@gd.com", new Date(), 12000.00);
			Employee emp2 = new Employee("Maggi", "maggi@gd.com", new Date(), 32000.00);
			Employee emp3 = new Employee("Bill", "bill@gd.com", new Date(), 52000.00);

			Pancard pancard1 = new Pancard("ARKYY8735T", new SimpleDateFormat("yyyy-MM-dd").parse("1988-07-15"));
			Pancard pancard2 = new Pancard("GRKCC8565T", new SimpleDateFormat("yyyy-MM-dd").parse("1990-05-20"));
			
			emp1.setPancard(pancard1);
			emp2.setPancard(pancard2);
			
			session.beginTransaction();
			//We only need to save Employee, mapped Pancard will be automatically stored in DB due to cascade.
			//Remmeber: 1st the Pancard record is inserted followed by Empployee record.
			//Because Pancard record must exist whose primary key will later be inseerted into Employee table as foreign key.
			
			Integer id = (Integer) session.save(emp1);
			System.out.println("Employee is created  with Id::" + id);
			Integer id2 = (Integer) session.save(emp2);
			System.out.println("Employee is created  with Id::" + id2);
			Integer id3 = (Integer) session.save(emp3);
			System.out.println("Employee is created  with Id::" + id3);
			session.getTransaction().commit();

			getAllEmployeePancardDetails(session);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	private static List getAllEmployeePancardDetails(Session session) {
		Query query = session.createNamedQuery("findAllEmployeePancardMapping", EmployeePancardDto.class);
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