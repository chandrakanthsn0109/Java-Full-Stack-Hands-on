package com.day1.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.day1.bean.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");//responsible for connection of db
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tn = session.beginTransaction();
		
//		Employee emp = new Employee();
//		emp.setEid(103);
//		emp.setEname("Manu");
//		emp.setEsalary(35000);
//		
//		session.update(emp);
//		Employee employee = session.get(Employee.class, 107);
//		System.out.println(employee);
//		System.out.println(employee.getEid()+" "+employee.getEname()+" "+employee.getEsalary());
		
//	    Query query = session.createQuery("FROM Employee");
//		List<Employee> employees = query.list();
//		for(Employee emp : employees) {
//			System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsalary());
//			System.out.println(employees);
//		}
		
//		Query query = session.createQuery("FROM Employee where eid = 107");
//		List<Employee> employees = query.list();
//		System.out.println(employees);
		
//		Query query = session.createQuery("FROM Employee where ename = 'Manoj'");
//		List<Employee> employees = query.list();
//		System.out.println(employees);

		//Dynamic value for query
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id value:");
//		int id = sc.nextInt();
//		Query query = session.createQuery("FROM Employee where eid=:id");
//		query.setParameter("id", id);
//		List<Employee> employees = query.list();
//		System.out.println(employees);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id value:");
//		int id = sc.nextInt();
//		System.out.println("Enter the name:");
//		String name = sc.next();
//		System.out.println("Enter the salary:");
//		int sal = sc.nextInt();
//		Query query = session.createQuery("update Employee set ename=:name, esalary=:salary where eid=:id");
//		query.setParameter("id", id);
//		query.setParameter("name", name);
//		query.setParameter("salary", sal);
//		int n = query.executeUpdate();
//		List<Employee> employees = query.list();
//		System.out.println(employees);
		
//		Query query = session.createQuery("update Employee set ename=:name, esalary=:salary where eid=:id");
//		query.setParameter("id", id);
//		int n = query.executeUpdate();
		
//		Query query = session.createQuery("select emp.eid,emp.esalary,emp.ename from Employee emp");
////		query.setParameter("id", id);
//		List<Object[]> employees = query.list();
//		for(Object emp[] : employees) {
//			System.out.println(emp[0] +" "+ emp[1]+" "+emp[2]);
//		}
		
		//Criteria Query
//		Criteria query = session.createCriteria(Employee.class);
////		query.setParameter("id", id);
//		List<Employee> employees = query.list();
//		for(Object emp : employees) {
//			System.out.println(emp);
//		}
		
//		Criteria query = session.createCriteria(Employee.class);
//		query.add(Restrictions.eqOrIsNull("eid", 101));
//		query.add(Restrictions.lt("esalary", 100000));
//		query.add(Restrictions.gt("esalary", 30000));

//		List<Employee> employees = query.list();
//		for(Object emp : employees) {
//			System.out.println(employees);
//		}
		
//		Native SQL
		SQLQuery query = session.createSQLQuery("select * from employee");
		query.addEntity(Employee.class);

		List<Employee> employees = query.list();
			System.out.println(employees);
  		
		tn.commit();
		session.close();
		factory.close();
	}

}
