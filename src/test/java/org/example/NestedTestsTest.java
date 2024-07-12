package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

public class NestedTestsTest {
    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Smith";


    @Getter @Setter
    @Builder
    class Customer{
        String gender;
        String middleName;
        Date becomeCustomer;
        String firstName;
        String lastName;
    }



    @Nested
    class BuilderTest {
        private String MIDDLE_NAME = "Michael";

        @Test
        void customerBuilder() throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date customerDate = simpleDateFormat.parse("04-21-2019");

            /*Customer customer = Customer.builder()
                    .gender("male")
                    .middleName(MIDDLE_NAME)
                    .becomeCustomer(customerDate)
                    .firstName(FIRST_NAME)
                    .lastName(LAST_NAME)
                    .build();*/


            /*assertAll(() -> {
                assertEquals("male", customer.getGender());
                assertEquals(MIDDLE_NAME, customer.getMiddleName());
                assertTrue(true, () -> "오류입니다.");
                assertEquals(FIRST_NAME, customer.getFirstName());
                assertEquals(customerDate, customer.getBecomeCustomer());
            });*/
        }
    }
}
