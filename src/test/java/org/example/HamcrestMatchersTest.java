package org.example;

import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {
    @Getter
    class Customer{
        String firstName;
        String lastName;

        public Customer(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Smith";
    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer(FIRST_NAME, LAST_NAME);
    }

    @Test
    @DisplayName("Hamcrest is, anyOf, allOf 매처를 사용한 테스트 : 마지막 실패")
    public void testHamcrestIs(){
        int price1 = 1, price2 = 1, price3 = 2;

        assertThat(1, is(price1));
        assertThat(1, anyOf(is(price1), is(price2)));
        assertThat(1, anyOf(is(price2), is(price3)));
        assertThat(1, allOf(is(price1), is(price2)));
        assertThat(2, allOf(is(price2), is(price3)));
    }

    @Test
    @DisplayName("nullValue 매처를 사용한 테스트")
    public void testNull(){
        assertThat(null, nullValue());
    }

    @Test
    @DisplayName("notNullValue 매처를 사용한 테스트")
    public void testNotNull(){
        assertThat(customer, notNullValue());
    }

    @Test
    @DisplayName("hasProperty 매처를 사용한 테스트")
    public void checkCorrectCustomerProperties(){
        assertThat(customer,
                allOf(hasProperty("firstName", is(FIRST_NAME)),
                        hasProperty("lastName", is(LAST_NAME))
                ));
    }
}
