package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringReversalTest {

    @Test
    void testReverseString() {
        StringReversal obj = new StringReversal();
        assertEquals("olleh", obj.reverse("hello"));
    }

    @Test
    void testEmptyString() {
        StringReversal obj = new StringReversal();
        assertEquals("", obj.reverse(""));
    }
}