package com.example.springrest.repo;

import com.example.springrest.wordcalculator.WordFrequency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WordFrequencyRepository extends JpaRepository<WordFrequency, Long> {
    List<WordFrequency> getWord(@Param("word") String word);
}
