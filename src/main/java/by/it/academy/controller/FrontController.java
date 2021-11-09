package by.it.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.it.academy.bean.News;
import by.it.academy.service.NewsService;

@Controller
@RequestMapping("/controller")
public class FrontController {
	
	@Autowired
	private NewsService newsService;
	
	@GetMapping("/news-list")
	public String listNews(Model model) {
		
		List<News> newsList = newsService.listNews();
		
		model.addAttribute("newsList", newsList);
		
		return "main-page";
	}
	
	@GetMapping ("/news-form")
	public String goToNewsForm(Model model) {
		
		News news = new News();
		
		model.addAttribute("news", news);
		
		return "news-form";
	}
	
	@PostMapping ("/add-news")
	public String addNews(@ModelAttribute("news") News news) {
		
		newsService.addNews(news);
		
		return "redirect:/controller/news-list";
	}
	
	@GetMapping ("/news-page")
	public String goToNewsPage(@RequestParam ("newsId") int newsId, Model model) {
		
		News news = newsService.getNews(newsId);
		
		model.addAttribute("news", news);
		
		return "news-page";
	}
	
	@GetMapping ("/delete-news")
	public String deleteNews(@RequestParam ("newsId") int newsId) {
		
		newsService.deleteNews(newsId);
		
		return "redirect:/controller/news-list";
	}

}
