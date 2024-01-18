package com.commerzbank.library.model;

public class Rental {
    private Person person;
    private LocalDate rentedOn;
    private LocalDate rentedEntil;
    private LocalDate returnedOn;
    private LocalDate returnedOn;
    private bool returned;
    private UUID ID;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getRentedOn() {
        return rentedOn;
    }

    public void setRentedOn(LocalDate rentedOn) {
        this.rentedOn = rentedOn;
    }

    public LocalDate getRentedEntil() {
        return rentedEntil;
    }

    public void setRentedEntil(LocalDate rentedEntil) {
        this.rentedEntil = rentedEntil;
    }

    public LocalDate getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(LocalDate returnedOn) {
        this.returnedOn = returnedOn;
    }

    public bool getReturned() {
        return returned;
    }

    public void setReturned(bool returned) {
        this.returned = returned;
    }



    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }





}
