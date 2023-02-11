package com.gd.client;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.gd.model.Employee;
import com.gd.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			createEmployee(session, getEmployee("Mark Wittmen", "mark@outlook.com", 233000.00, new Date()));
			createEmployee(session, getEmployee("Smith Dias", "smith@gmail.com", 33000.00, new Date()));
			createEmployee(session, getEmployee("Martin Bingel", "martin.cs2022@gmail.com", 50000.00, new Date()));
			getEmployeebyId(session, "Mark Wittmen");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static void getEmployeebyId(Session session, String employyeeNameToSearch) {
		String hql = "FROM Employee E WHERE E.employeeName = :employeeName";
		Query<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("employeeName", employyeeNameToSearch);
		List<Employee> results = query.list();
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
