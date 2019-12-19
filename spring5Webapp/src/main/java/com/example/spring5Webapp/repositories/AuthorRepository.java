package com.example.spring5Webapp.repositories;

import com.example.spring5Webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
