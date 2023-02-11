package com.gd.client;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.model.Employee;
import com.gd.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			createEmployee(session, getEmployee("Mark Wittmen", "mark@outlook.com", 233000.00, new Date()));
			createEmployee(session, getEmployee("Smith Dias", "smith@gmail.com", 33000.00, new Date()));
			createEmployee(session, getEmployee("Martin Bingel", "martin.cs2022@gmail.com", 50000.00, new Date()));
			createEmployee(session, getEmployee("Steve Harison", "steve@gmail.com", 70000.00, new Date()));
			getEmployeebyId(session, "Steve Harison");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static void getEmployeebyId(Session session, String employyeeNameToSearch) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> emeployeeRoot = criteriaQuery.from(Employee.class);
		List<Employee> results = session.createQuery(criteriaQuery.select(emeployeeRoot)
				.where(criteriaBuilder.equal(emeployeeRoot.get("employeeName"), employyeeNameToSearch))).list();

		if (results.isEmpty())
			System.out.println("No Employee Found");
		else
			System.out.println(results.get(0));
	}

	private static void createEmployee(Session session, Employee e) {
		session.beginTransaction();
		Integer id = (Integer) session.save(e);
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}

	private static Employee getEmployee(String name, String email, double salary, Date doj) {
		Employee employee = new Employee();
		employee.setEmployeeName(name);
		employee.setEmail(email);
		employee.setSalary(salary);
		employee.setDoj(doj);
		return employee;
	}
}
