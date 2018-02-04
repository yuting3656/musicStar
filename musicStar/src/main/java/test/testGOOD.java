package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import model.MemberBean;
import model.dao.MemberDAOHibernate;

public class testGOOD {
	public static void main(String[] args) {
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory factory = new MetadataSources().buildMetadata().buildSessionFactory();
		Session session = factory.getCurrentSession();
		factory.getCurrentSession().beginTransaction();

		MemberDAOHibernate dao = new MemberDAOHibernate(session);
		MemberBean bean = dao.select("9527");
		System.out.println("bean:" + bean);
		factory.getCurrentSession().getTransaction().commit();
		session.close();
	}
}
