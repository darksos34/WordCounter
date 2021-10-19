package com.example.springrest.repo;

import com.example.springrest.wordcalculator.WordFrequency;
import com.example.springrest.wordcalculator.WordFrequencyAnalyzerImpl;

import com.example.springrest.wordcalculator.WordFrequencyImpl;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

//Documentation  https://spring.io/guides/gs/rest-service/
@RestController
public class WordFrequenceController {

    private WordFrequencyRepository wordFrequencyRepository;
    private WordFrequenceModel wordFrequenceModel;
    private WordFrequencyImpl wordFrequency;

    private final String template = "The sun shines over the lake, "+ Arrays.toString(new WordFrequenceModel[]{wordFrequenceModel});
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/frequence")
    public WordFrequencyImpl getWordFrequency (@RequestParam(value = "word",defaultValue = "text") String text, String word){
        WordFrequencyImpl myWordFrequenceAnalyzerImpl = new WordFrequencyImpl();
        myWordFrequenceAnalyzerImpl.getWord();
        myWordFrequenceAnalyzerImpl.getFrequency(
        );
        WordFrequencyAnalyzerImpl myWordFrequenceAnalyzer = new WordFrequencyAnalyzerImpl();
        myWordFrequenceAnalyzer.calculateMostFrequentNWords();

        return myWordFrequenceAnalyzerImpl;
    }
    @GetMapping("/words")
    public WordFrequenceModel wordFrequenceModel(@RequestParam(value = "word", defaultValue = "word") String text, String word) {

        return new WordFrequenceModel(counter.incrementAndGet(), String.format(template, text, word));
    }
    @GetMapping("/hello")
    public String tryWord() {
        return "hi";
    }

    @GetMapping("/listofwords")
    public List<WordFrequency> getWordsFrequence() {
        return wordFrequencyRepository.findAll();
    }


    @GetMapping("/good")
    public Optional<WordFrequency> wordFrequency(@PathVariable  String text){

        //Implements class

        return wordFrequency(text);
    }


}
