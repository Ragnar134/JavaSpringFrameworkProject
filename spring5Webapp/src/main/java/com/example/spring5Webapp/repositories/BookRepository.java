package com.example.spring5Webapp.repositories;

import com.example.spring5Webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
