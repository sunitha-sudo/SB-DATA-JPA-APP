package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lti.Entity.Book;
import com.lti.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		         BookRepository bookRepository = context.getBean(BookRepository.class);
		         //Create Book obj
		                   Book b=new Book();
		                        b.setBookId(129);
		                        b.setBookName("SPRING");
		                        b.setBookPrice(429.43);
		                  bookRepository.save(b); //UPSERT
		                        
	}

}
