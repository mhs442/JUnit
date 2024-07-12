package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedWithCsvSourceTest {
    class WordCounter{
        public int countWords(String sentence){
            return sentence.length();
        }
    }
    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @CsvSource({"2, Unit Testing, 10", "3, JUnit in Action, 11", "4, Write solid Java code, 12"})
    void testWordsInSentence(int expected, String sentence, int num){
        assertEquals(expected, wordCounter.countWords(sentence));
    }
}
