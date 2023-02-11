package com.gd.client;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.gd.dto.EmployeeVehicleDto;
import com.gd.model.Employee;
import com.gd.model.Vehicle;
import com.gd.util.HibernateUtil;

public class App {

	public static void main(String[] args) throws ParseException {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Employee emp1 = new Employee("Gd", "gd@gd.com", new Date(), 12000.00);

			Vehicle vehicle1 = new Vehicle("MH12GD0709", "Honda City");
			Vehicle vehicle2 = new Vehicle("AP12GD0709", "Kia Seltos");
			vehicle1.setEmployee(emp1);
			vehicle2.setEmployee(emp1);

			session.beginTransaction();
			// We only need to save Vehicle, mapped Employee will be automatically stored in
			// DB due to cascade.
			Integer id = (Integer) session.save(vehicle1);
			System.out.println("Vehicle is created  with Id::" + id);
			Integer id2 = (Integer) session.save(vehicle2);
			System.out.println("Vehicle is created  with Id::" + id2);
			session.getTransaction().commit();

			getAllEmployeeVehiclesDetails(session);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	private static List getAllEmployeeVehiclesDetails(Session session) {
		Query query = session.createNamedQuery("findAllEmployeeVehiclesMapping", EmployeeVehicleDto.class);
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