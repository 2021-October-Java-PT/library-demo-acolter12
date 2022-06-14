package org.wecancodeit.librarydemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    String title;
    private String description;
    @ManyToOne
    private Campus campus;
    @ManyToMany
    private Collection<Author>authors;

    public Book(){

    }

    public Book(String title, String description, Campus campus, Author ...authors) {
        this.title = title;
        this.description = description;
        this.campus = campus;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
