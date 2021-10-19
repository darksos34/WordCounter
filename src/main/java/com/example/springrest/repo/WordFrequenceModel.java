package com.example.springrest.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WordFrequenceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    String Word ;
    String Text;

    public WordFrequenceModel(long l, String text) {
        Text = text;
        this.Word = Word;
    }
    public WordFrequenceModel() {
        Text = Text;
        this.Word = Word;
    }

    public String getText() {
        return Text;
    }

    public String getWord(String word) {
        return Word;
    }
}
