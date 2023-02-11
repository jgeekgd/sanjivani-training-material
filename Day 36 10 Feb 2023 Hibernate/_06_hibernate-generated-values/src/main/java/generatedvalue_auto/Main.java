package generatedvalue_auto;

import java.util.Date;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			createEmployeeAutoNumeric(session);
			createEmployeeAutoUUID(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static void createEmployeeAutoNumeric(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getEmployeeAutoNumeric());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}

	private static void createEmployeeAutoUUID(Session session) {
		session.beginTransaction();
		UUID id = (UUID) session.save(getEmployeeAutoUUID());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}
	private static Employee_Auto_Numeric getEmployeeAutoNumeric() {
		Employee_Auto_Numeric employee = new Employee_Auto_Numeric();
		employee.setEmployeeName("Martin Bingel");
		employee.setEmail("martin.cs2017@gmail.com");
		employee.setSalary(50000.00);
		employee.setDoj(new Date());
		return employee;
	}
	private static Employee_Auto_UUID getEmployeeAutoUUID() {
		Employee_Auto_UUID employee = new Employee_Auto_UUID();
		employee.setEmployeeName("Martin Bingel");
		employee.setEmail("martin.cs2017@gmail.com");
		employee.setSalary(50000.00);
		employee.setDoj(new Date());
		return employee;
	}
}
