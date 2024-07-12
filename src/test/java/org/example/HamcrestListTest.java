package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HamcrestListTest {
    private List<String> values;

    @BeforeEach // 각 테스트 메서드를 실행하기 전 실행
    public void setUp(){
        values = new ArrayList<>();
        values.add("김서영");
        values.add("문햇살");
        values.add("정예지");
    }

    @Test
    @DisplayName("Hamcrest를 사용한 테스트 : 실패")
    public void testListWithHamcrest(){
        assertThat(values, hasSize(3));
        assertThat("단 한가지도 존재하지 않음", values, hasItem(anyOf(equalTo("김서영"), equalTo("문테스트"), equalTo("정테스트"))));
    }

    @Test
    @DisplayName("Hamcrest를 사용하지 않은 테스트 : 실패")
    public void testListWithoutHamcrest(){
        assertEquals(3, values.size());
        assertTrue(values.contains("김테스트") || values.contains("문테스트") || values.contains("정테스트"));
    }
}
