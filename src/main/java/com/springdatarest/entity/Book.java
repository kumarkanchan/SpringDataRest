package com.springdatarest.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="book_collection")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private String author;
    private Integer pages;

}
