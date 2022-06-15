package org.wecancodeit.librarydemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.librarydemo.models.Author;
import org.wecancodeit.librarydemo.models.Book;
import org.wecancodeit.librarydemo.models.Campus;
import org.wecancodeit.librarydemo.repositories.AuthorRepository;
import org.wecancodeit.librarydemo.repositories.BookRepository;
import org.wecancodeit.librarydemo.repositories.CampusRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private CampusRepository campusRepo;

    @Resource
    private AuthorRepository authorRepo;

    @Resource
    private BookRepository bookRepo;

    @Override
    public void run(String... args) throws Exception {
        Campus columbus = new Campus("Columbus");
        campusRepo.save(columbus);

        Campus cleveland = new Campus("Cleveland");
        campusRepo.save(cleveland);

        Author sierra = new Author("Kathy", "Sierra");
        Author bates = new Author("Burt", "Bates");
        Author beck = new Author("Kent", "Beck");
        Author fowler = new Author("Martin", "Fowler");
        Author martin = new Author("Micah", "Martin");

        authorRepo.save(sierra);
        authorRepo.save(bates);
        authorRepo.save(beck);
        authorRepo.save(fowler);
        authorRepo.save(martin);

        Book headfirstJava = new Book("Heas First Java", "A good book", columbus, sierra, bates);
        Book tddByExample = new Book("TDD BY Example", "Book is coll", columbus, beck);
        Book refactoring = new Book("Refactoring", "The book to refactor", columbus, fowler);
        Book agileCSHarp = new Book("Agile Principles", "GOod book", cleveland, martin);

        bookRepo.save(headfirstJava);
        bookRepo.save(tddByExample);
        bookRepo.save(refactoring);
        bookRepo.save(agileCSHarp);
    }
}
