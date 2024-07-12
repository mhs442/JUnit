package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class IsClass {
    private String os = System.getProperty("os.name");

    @BeforeEach // beforeEach 어노테이션을 통해 각 테스트를 실행하기 전에 사전 점검 : 가정문
    void setUp(){
        boolean isWindow = false;
        if(os.contains("Window")){
            isWindow = true;
        }
        assumeTrue(isWindow);   // assumeTrue를 이용해 true, false를 판단
    }

    @Test
    void justTest(){
        assertEquals("true", "true");
    }
}
