
package com.example.notes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Note {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = IDENTITY)
    private String id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "CONTENT")
    private String content;
}
