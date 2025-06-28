package com.example.demo.model;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "usertable")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public User(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}

