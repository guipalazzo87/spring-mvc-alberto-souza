package dev.guipalazzo.springmvcalbertosouza.models;

import dev.guipalazzo.springmvcalbertosouza.controllers.BookType;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class ValueByType {
    @Column(scale = 2)
    private BigDecimal price;
    private BookType bookType;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}


