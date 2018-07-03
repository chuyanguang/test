package cn.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.dao.UserDao;
import cn.pojo.User;

@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public UserDaoImpl() {
	}

	@Autowired
	public UserDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	@Override
	public List<User> findAll() {
	/*	List<User> list = this.getHibernateTemplate().execute(
				new HibernateCallback<List<User>>() {
					@Override
					public List<User> doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createSQLQuery("select *  from user");
						return query.list();
					}
				});*/
		List  userlist = this.getHibernateTemplate().find("from cn.pojo.User");
		List<User> list=this.getHibernateTemplate().find("from User");
		return list;
	}

	@Override
	public int add(cn.pojo.User u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
