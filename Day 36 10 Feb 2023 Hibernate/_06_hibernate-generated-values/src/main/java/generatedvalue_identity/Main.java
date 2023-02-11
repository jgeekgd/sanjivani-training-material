package generatedvalue_identity;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			createEmployeeIdenitity(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static void createEmployeeIdenitity(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getEmployeeIdentity());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}
	private static Employee_Identity getEmployeeIdentity() {
		Employee_Identity employee = new Employee_Identity();
		employee.setEmployeeName("Martin Bingel");
		employee.setEmail("martin.cs2017@gmail.com");
		employee.setSalary(50000.00);
		employee.setDoj(new Date());
		return employee;
	}
}
