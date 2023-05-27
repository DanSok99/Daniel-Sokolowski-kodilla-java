package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {
    @Test
    void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1,1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.8,1.4))
        );
    }
}
