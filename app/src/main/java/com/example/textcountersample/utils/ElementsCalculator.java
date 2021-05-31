package com.example.textcountersample.utils;

public class ElementsCalculator {
    public static int getCharsCount(String Text) {
        if (Text != null) {
            return Text.length();

        }
        return 0;
    }

    public static int getWordsCount(String TextWords) {
        int count = 0;

        for (char c : TextWords.toCharArray()) {

            if (Character.isSpaceChar(c)) {
                count++;
            }
        }

        if (count == 0) {
            return 1;
        } else {
            return count;
        }
    }

}