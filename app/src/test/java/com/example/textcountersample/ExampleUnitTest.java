package com.example.textcountersample;

import com.example.textcountersample.utils.ElementsCalculator;

import org.junit.Test;


import static org.junit.Assert.*;

public class  ElementsCalculatorUnitTests {

    @Test
    public void Given_Null_Return_NullPointerException(){
        final String givenString = null;

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_Null_Return_NullPointerException(){
        final String givenString = null;

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void Given_NoSpaces_Return_NumberOfCharsInString(){
        final String givenString = "labas";

        final int expectedResult = 5;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_NoSpaces_Return_NumberOfCharsInString(){
        final String givenString = "labas";

        final int expectedResult = 5;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithSpacesOnly_Return_dZero(){
        final String givenString = "   ";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithSpacesOnly_Return_dZero(){
        final String givenString = "   ";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void Given_SymbolsOnly_Return_NumberOfSymbols(){
        final String givenString = ".,;:(){}";

        final int expectedResult = 8;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_SymbolsOnly_Return_NumberOfSymbols(){
        final String givenString = ".,;:(){}";

        final int expectedResult = 8;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }




    @Test
    public void Given_hWordsSeparatedWithSpaces_Return_NumberOfNonWhitespaceCharacters(){
        final String givenString = "a b c";

        final int expectedResult = 3;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_SymbolsOnly_Return_NumberOfSymbols(){
        final String givenString = ".,;:(){}";

        final int expectedResult = 8;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

}