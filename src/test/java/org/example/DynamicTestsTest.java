package org.example;

import org.junit.jupiter.api.*;

import java.util.Iterator;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsTest {
    interface PredicateInterface{
        boolean check(float number);
    }

    class PositiveNumberPredicate implements PredicateInterface {
        @Override
        public boolean check(float number){
            if(number <= 0){
                return false;
            }
            else if(number > 0){
                return true;
            }

            return false;
        }
    }

    private PositiveNumberPredicate predicate = new PositiveNumberPredicate();

    @BeforeAll
    static void setUpClass(){
        System.out.println("@BeforeAll method");
    }

    @AfterAll
    static void tearDownClass(){
        System.out.println("@AfterAll method");
    }

    @BeforeEach
    void setUp(){
        System.out.println("@BeforeEach method");
    }

    @AfterEach
    void tearDown(){
        System.out.println("@AfterEach method");
    }


    @TestFactory
    Iterator<DynamicTest> positiveNumberPredicateTestCases(){
        return asList(
                dynamicTest("negative number", () -> assertFalse(predicate.check(-1))),
                dynamicTest("zero", () -> assertFalse(predicate.check(0))),
                dynamicTest("positive number", () -> assertTrue(predicate.check(1)))
        ).iterator();
    }

}
