package org.example.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void test_lombok(){

        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResPonseDto dto = new HelloResPonseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);      //assertj라는 테스트 검증 라이브러리의 검증 메소드
        assertThat(dto.getAmount()).isEqualTo(amount);


    }
}
