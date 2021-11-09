package by.it.academy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.it.academy.bean.News;

@Repository
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<News> listNews() {

		Session session = sessionFactory.getCurrentSession();

		Query<News> query = session.createQuery("from News order by id", News.class);

		return query.getResultList();
	}

	@Override
	public void addNews(News news) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(news);
	}

	@Override
	public News getNews(int Id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(News.class, Id);
	}

	@Override
	public void deleteNews(int Id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from News where id=:newsId");
		
		query.setParameter("newsId", Id);
		
		query.executeUpdate();
	}

}
