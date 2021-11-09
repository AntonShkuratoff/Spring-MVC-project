package by.it.academy.dao;

import java.util.List;

import by.it.academy.bean.News;

public interface NewsDAO {

	List<News> listNews();

	void addNews(News news);

	News getNews(int Id);

	void deleteNews(int Id);

}
