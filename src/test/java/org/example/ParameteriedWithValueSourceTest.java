package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameteriedWithValueSourceTest {
    class WordCounter{
        public int countWords(String sentence){
            return sentence.length();
        }
    }

    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @ValueSource(strings = {"Check three parameters", "JUnit in Action", "이건 어떻게 세려나?"})
    void testWordsInSentence(String sentence){
        assertEquals(22, wordCounter.countWords(sentence), 5);
    }
}
