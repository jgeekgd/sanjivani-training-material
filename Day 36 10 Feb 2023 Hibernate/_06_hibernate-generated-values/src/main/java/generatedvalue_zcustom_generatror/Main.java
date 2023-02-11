package generatedvalue_zcustom_generatror;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			createEmployeeCustomGenerator(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static void createEmployeeCustomGenerator(Session session) {
		session.beginTransaction();
		String id = (String) session.save(getEmployeeCustomGenerator());
		String id2 = (String) session.save(getEmployeeCustomGenerator());
		String id3 = (String) session.save(getEmployeeCustomGenerator());
		System.out.println("Employee is created  with Id::" + id);
		System.out.println("Employee is created  with Id2::" + id2);
		System.out.println("Employee is created  with Id3::" + id3);
		session.getTransaction().commit();
	}
	private static Employee_Custom_Generator getEmployeeCustomGenerator() {
		Employee_Custom_Generator employee = new Employee_Custom_Generator();
		employee.setEmployeeName("Martin Bingel");
		employee.setEmail("martin.cs20172@gmail.com");
		employee.setSalary(50000.00);
		employee.setDoj(new Date());
		return employee;
	}
}
