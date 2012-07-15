package dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class HibernateDAO {

	private Session session;
	
	public HibernateDAO() {
		session = new HibernateUtil().getSession();
	}
	
	public void inserir(Object classe) {
		Transaction tx = session.beginTransaction();
		session.persist(classe);
		tx.commit();
	}
	
	public void atualizar(Object classe) {
		Transaction tx = session.beginTransaction();
		session.merge(classe);
		tx.commit();
	}
	
	public void excluir(Object classe) {
		Transaction tx = session.beginTransaction();
		session.delete(classe);
		tx.commit();
	}
	
	public Collection<?> consultar(String sql) {
		return session.createQuery(sql).list();
	}
}
