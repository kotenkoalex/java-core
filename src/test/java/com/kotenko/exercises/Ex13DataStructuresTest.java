package com.kotenko.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex13DataStructuresTest {
    @Test
    void isBalancedCase1True() {
        assertTrue(Ex13DataStructures.isBalanced("[{{[(){}]}}[]{}{{(())}}]"));
    }

    @Test
    void isBalancedCase2True() {
        assertTrue(Ex13DataStructures.isBalanced("[{{}}[]{}{{(())}}]"));
    }

    @Test
    void isBalancedCase3True() {
        assertTrue(Ex13DataStructures.isBalanced("[{}{}{{()}}]"));
    }

    @Test
    void isBalancedCase4True() {
        assertTrue(Ex13DataStructures.isBalanced("[{}{{}}]"));
    }

    @Test
    void isBalancedCase5True() {
        assertTrue(Ex13DataStructures.isBalanced("[{{}}]"));
    }

    @Test
    void isBalancedCase6True() {
        assertTrue(Ex13DataStructures.isBalanced("[{}]"));
    }

    @Test
    void isBalancedCase7True() {
        assertTrue(Ex13DataStructures.isBalanced(""));
    }
}
