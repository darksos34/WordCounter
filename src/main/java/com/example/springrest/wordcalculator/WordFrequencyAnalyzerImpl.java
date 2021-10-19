package com.example.springrest.wordcalculator;

import java.util.*;

public class WordFrequencyAnalyzerImpl implements WordFrequencyAnalyzer {
    Scanner scan = new Scanner(System.in);
    private WordFrequency wordFrequency;
    private String WordFrequency;
    private WordFrequencyAnalyzer wordFrequencyAnalyzer;

    public void calculateHighestFrequency(String text) {

        String str = scan.nextLine();

        String[] s = str.split(" ");

        int count = 1;

        for (int i = 0; i <= s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j]) && s[i] != "-1") {
                    s[j] = "-1";
                    count++;
                }
            }

            if (count > 1 && s[i] != "-1") {
                System.out.println(s[i] + " " + count);
                s[i] = "-1";
            }
            count = 1;
        }
        System.out.println(str);
    };

    public int calculateFrequencyForWord(String text, String word) {
        text = "The sun shines over the lake";

        //-------Supporting Function-----------------

        //------- Convert String to proper format----
        text = text.replaceAll("[^A-Za-z0-9\\s]", "");
        text = text.replaceAll(" +", " ");
        text = text.toLowerCase();

        //-------Create String to an array with words------
        String[] s2 = text.split(" ");
        System.out.println(text);

        //-------- Create a HashMap to store each word and its count--
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : s2) {

            if (map.containsKey(s)) //---- Verify if Word Already Exits---
            {
                map.put(s, 1 + map.get(s)); //-- Increment value by 1 if word already exits--
            } else {
                map.put(s, 1); // --- Add Word to map and set value as 1 if it does not exist in map--
            }
        }
        System.out.println(map); //--- Print the HashMap with Key, Value Pair-------


        return Integer.parseInt(text);
    }

    public void calculateMostFrequentNWords(String text, int n) {

    }
    public void calculateMostFrequentNWords() {

        String myStr = "The sun shines over the lake";
        String[] splited = myStr.split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int max = 0;
        int count= 1;
        String word = splited[0];
        String curr = splited[0];
        for(int i = 1; i<splited.length; i++){
            if(splited[i].equals(curr)){
                count++;
            }
            else{
                count =1;
                curr = splited[i];
            }
            if(max<count){
                max = count;
                word = splited[i];
            }
        }
        System.out.println(max + " x " + word);

    }

}