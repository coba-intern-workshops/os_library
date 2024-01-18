package com.commerzbank.library.model;


@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Book {
    private UUID ID;
    private String title;
    private String author;
    private BookStatus status;

    public Book(UUID ID, java.lang.String title, java.lang.String author, BookStatus status) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }


}
