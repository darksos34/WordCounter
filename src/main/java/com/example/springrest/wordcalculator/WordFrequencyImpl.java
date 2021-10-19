package com.example.springrest.wordcalculator;

public class WordFrequencyImpl implements WordFrequency{
    private final String S = "The sun is shining";
    @Override
    public String getWord() {
        System.out.println("The sun is shining");
        return S;
    }
    @Override
    public int getFrequency() {
        System.out.println("The sun is shining");
        return 0;
    }

}
