package com.gd.client;

import org.hibernate.Session;

import com.gd.model.Employee;
import com.gd.util.HibernateUtil;

public class SecondLevelCacheActive {
	public static void main(String[] args) throws Exception {
		Session session = null;
		try {
			Integer employeeId = 1;
			session = HibernateUtil.getSessionFactory().openSession();
			Employee employee1 = session.get(Employee.class, employeeId);
			System.out.println(employee1);
		} catch (Exception e) {
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		System.out.println("-------------------------------------------------------------");
		
		try {
			Integer employeeId = 1;
			session = HibernateUtil.getSessionFactory().openSession();
			Employee employee1 = session.get(Employee.class, employeeId);
			System.out.println(employee1);
		} catch (Exception e) {
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}

//Single SELECT Query hit to DB by Hibernate even if there are two sessions since level 2 i.e. L2 cache was enabled
//
//Hibernate: 
//    select
//        employee0_.employee_id as employee1_0_0_,
//        employee0_.date_of_joing as date_of_2_0_0_,
//        employee0_.email as email3_0_0_,
//        employee0_.employee_name as employee4_0_0_,
//        employee0_.salary as salary5_0_0_ 
//    from
//        employee_second_level_cache employee0_ 
//    where
//        employee0_.employee_id=?
//Employee [employeeId=1, employeeName=Martin Bingel, email=martin.cs2017@gmail.com, doj=2022-04-25 02:18:00.956, salary=50000.0]
//-------------------------------------------------------------
//Employee [employeeId=1, employeeName=Martin Bingel, email=martin.cs2017@gmail.com, doj=2022-04-25 02:18:00.956, salary=50000.0]
