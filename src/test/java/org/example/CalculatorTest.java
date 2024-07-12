package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void TestAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(50, 10);
        /**
         * 첫번째 파라미터 : expected => 예상 결과 값
         * 두번째 파라미터 : actual => 검증할 값
         * 세번째 파라미터 : delta => 오차 범위 지정 expected - actual, expected + actuald 범위 내에 있으면 테스트 통과
         */
        assertEquals(60, result, 0);
    }


}
