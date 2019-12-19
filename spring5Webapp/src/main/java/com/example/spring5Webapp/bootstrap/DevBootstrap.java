package com.example.spring5Webapp.bootstrap;

import com.example.spring5Webapp.model.Author;
import com.example.spring5Webapp.model.Book;
import com.example.spring5Webapp.model.Publisher;
import com.example.spring5Webapp.repositories.AuthorRepository;
import com.example.spring5Webapp.repositories.BookRepository;
import com.example.spring5Webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/16/17.
 */
@Component
public class DevBootstrap implements  ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();

    }

    private void initData() {

        Publisher sam = new Publisher("Sam","RowStreet 134","GeorgeVille","Nevada",3512);
        publisherRepository.save(sam);
        //Eric
        Author eric = new Author("Eric", "Evans");

        Book ddd = new Book("Domain Driven Design", "1234",sam);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Publisher ben = new Publisher("Ben","FirstStreet 28","New York","New York",25682);
        publisherRepository.save(ben);

        //Rod
        Author rod = new Author("Rod", "Johnson");

        Book noEJB = new Book("J2EE Development without EJB", "23444", ben);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }

}