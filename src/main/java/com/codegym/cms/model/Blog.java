package com.codegym.cms.model;
import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Author;
    private String Content;
    private String Title;

    public Blog() {
    }

    public Blog(String Author, String Content) {
        this.Author = Author;
        this.Content = Content;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, Author='%s', Content='%s', Title='%s'']", id, Author, Content, Title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title=title;
    }
}

