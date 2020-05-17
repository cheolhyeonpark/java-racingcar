package com.cheolhyeonpark.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("true값을 매개변수로 move 메서드를 실행하면 car의 position이 1 증가한다")
    void moveWhenParameterIsTrue() {
        //given
        Car car = new Car();

        //when
        car.move(true);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("false값을 매개변수로 move 메서드를 실행하면 car의 position이 증가하지 않는다")
    void moveWhenParameterIsFalse() {
        //given
        Car car = new Car();

        //when
        car.move(false);

        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }
}