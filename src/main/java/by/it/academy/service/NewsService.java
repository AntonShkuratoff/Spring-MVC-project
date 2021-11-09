package by.it.academy.service;

import java.util.List;

import by.it.academy.bean.News;

public interface NewsService {
	
	List<News> listNews();
	
	void addNews(News news);
	
	News getNews(int Id);
	
	void deleteNews(int Id);

}
