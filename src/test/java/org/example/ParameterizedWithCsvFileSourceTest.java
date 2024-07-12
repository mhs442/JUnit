package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedWithCsvFileSourceTest {
    class WordCounter{
        public int countWords(String sentence){
            return sentence.length();
        }
    }

    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @CsvFileSource(resources = "word_counter.csv")
    void testWordsInSentence(int expected, String sentence){
        assertEquals(expected, sentence);
    }
}
