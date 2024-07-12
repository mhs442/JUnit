package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("display name 어노테이션을 테스트하기 위한 클래스")
public class DisplayNameTest {

    @Test
    @DisplayName("hello 테스트")
    public void testHello(){
        assertEquals("Hello", "Hello");
    }

    @Test
    @DisplayName("😋")
    public void testTalking(){
        assertEquals("How are you?", "How are you?");
    }

    @Test
    public void testBye(){
        assertEquals("bye", "bye");
    }

    @Disabled("기능 개선중")
    @Test
    public void testDisabled(){
        assertEquals("비활성화", "비활성화");
    }
}
