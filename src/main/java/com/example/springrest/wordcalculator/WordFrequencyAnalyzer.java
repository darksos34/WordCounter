package com.example.springrest.wordcalculator;

public interface WordFrequencyAnalyzer {
    void calculateHighestFrequency(String text);
    int calculateFrequencyForWord (String text, String word);
    void calculateMostFrequentNWords (String text, int n);
}