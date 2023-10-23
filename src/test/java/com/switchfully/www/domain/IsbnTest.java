package com.switchfully.www.domain;

import com.switchfully.www.domain.book.Isbn;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IsbnTest {
    private Isbn isbn;
    boolean result;

    @BeforeEach
    void setup(){
        isbn = new Isbn("9783456789123");
//        result = isbn.isValidIsbn();
    }
    @Test
    @DisplayName("ISBN is 13 digits long")
    void isValidIsbn_givenAnISBN_thenVerifyLengthEquals13(){
        String result = isbn.getIsbn();



        Assertions.assertThat(result).hasSize(13);
    }
    @Test
    @DisplayName("ISBN begins with 978 or 979")
    void isValidIsbn_givenAnISBN_thenBeginsWith978Or979(){

        Assertions.assertThat(result).isTrue();
    }


}