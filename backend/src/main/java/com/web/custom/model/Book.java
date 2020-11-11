package com.web.custom.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Data
public class Book {
    @Id
    private int isbn;
    private String name;
    private String genre;
    private String writer;
    private String publisher;
}
