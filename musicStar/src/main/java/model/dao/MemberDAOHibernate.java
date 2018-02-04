package model.dao;

import java.util.List;

import org.hibernate.Session;

import model.MemberBean;

public class MemberDAOHibernate {
	private Session session = null;

	// session
	public MemberDAOHibernate(Session session) {
		this.session = session;
	}
	public Session getSession() {
		return session;
	}

	// select(id)

	public MemberBean select(String id) {
		return (MemberBean) this.getSession().get(MemberBean.class, id);
	}

	// select
	public List<MemberBean> select() {
		return this.getSession().createQuery("from MemberBean", MemberBean.class).list();
	}

	// insert
	public MemberBean insert(MemberBean bean) {
		if (bean != null) {
			MemberBean temp = this.getSession().get(MemberBean.class, bean.getMember_id());
			if (temp == null) {
				this.getSession().save(bean);
				return bean;
			}
		}
		return null;
	}

	// update
	public MemberBean update(MemberBean bean) {
		if(bean!=null) {
			MemberBean temp = this.getSession().get(MemberBean.class, bean.getMember_id());
			if (temp != null) {
				temp.setMember_email(bean.getMember_email());
				temp.setMember_id(bean.getMember_id());
				temp.setMember_name(bean.getMember_name());
				temp.setMember_password(bean.getMember_password());
				return bean;
		}
	}
		return null;
 }
}
