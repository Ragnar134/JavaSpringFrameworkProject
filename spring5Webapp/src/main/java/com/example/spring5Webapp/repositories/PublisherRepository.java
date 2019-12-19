package com.example.spring5Webapp.repositories;

import com.example.spring5Webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
