package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class NullTest {
    @Test
    public void isNull(){
        String a = "test";

        assertNull(a, () -> "Null이 아닙니다.");
    }
}
