package by.it.academy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.it.academy.bean.News;
import by.it.academy.dao.NewsDAO;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsDAO newsDAO;

	@Override
	@Transactional
	public List<News> listNews() {
		
		return newsDAO.listNews();
	}

	@Override
	@Transactional
	public void addNews(News news) {
		
		newsDAO.addNews(news);		
	}

	@Override
	@Transactional
	public News getNews(int Id) {
		
		return newsDAO.getNews(Id);
	}

	@Override
	@Transactional
	public void deleteNews(int Id) {
		
		newsDAO.deleteNews(Id);
	}

}
