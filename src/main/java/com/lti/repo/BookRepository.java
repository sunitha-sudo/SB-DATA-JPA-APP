package com.lti.repo;

import org.springframework.data.repository.CrudRepository;

import com.lti.Entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
