package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.entity.Book;
import net.skhu.repository.BookRepository;

@RestController
public class BookController {
	@Autowired BookRepository bookRepository;
	
//	@RequestMapping("book/test1")
//	public List	<Book> test1() {
//		return bookRepository.findBytitle("레미제라블");
//	}
	@RequestMapping("book/test1")
	public Book test1() {
		return bookRepository.findBytitle("레미제라블");
	}
	
	@RequestMapping("book/test2")
	public List<Book> test2() {
		return bookRepository.findByauthor("홍길동");
	}
	@RequestMapping("book/test3")
		public List<Book> test3(){
			return bookRepository.findByTitleStartsWith("고");
	}
	@RequestMapping("book/test4")
	public List<Book> test4(){
		return bookRepository.findByOrderByTitle();
	}
}
