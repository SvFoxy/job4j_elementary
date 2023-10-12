package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then22() {
        int left = 1;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2To4Then4() {
        int a = 3;
        int b = 2;
        int c = 4;
        int result = Max.max(a, b, c);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax33To20To4To5Then33() {
        int a = 33;
        int b = 22;
        int c = 4;
        int d = 5;
        int result = Max.max(a, b, c, d);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }
}