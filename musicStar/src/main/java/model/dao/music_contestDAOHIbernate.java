package model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;

import model.Music_contestBean;

@Entity
@Table(name = "music_contest")
public class music_contestDAOHIbernate {

	// session
	public music_contestDAOHIbernate(Session sessoin) {
		this.sessoin = sessoin;
	}

	private Session sessoin = null;

	public Session getSessoin() {
		return sessoin;
	}

	// select(id)
	public Music_contestBean select(int id) {
		return (Music_contestBean) this.getSessoin().get(Music_contestBean.class, id);
	}

	// select
	public List<Music_contestBean> select() {
		return this.getSessoin().createQuery("from Music_contestBean", Music_contestBean.class).list();
	}

	// insert
	public Music_contestBean insert(Music_contestBean bean) {
		if (bean != null) {
			Music_contestBean temp = this.getSessoin().get(Music_contestBean.class, bean.getMusic_contest_id());
			if (temp == null) {
				this.getSessoin().save(bean);
				return bean;
			}
		}
		return null;
	}

	// update
	public Serializable update(Music_contestBean bean) {
		return this.getSessoin().save(bean);
				}
	// delete

}
