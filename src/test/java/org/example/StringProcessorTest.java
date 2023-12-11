package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringProcessorTest {
    @Test
    public void TestCopyString() {
        String s = "Hello";
        int N = 3;
        String expected = "HelloHelloHello";
        StringProcessor SP = new StringProcessor();
        assertEquals(expected, SP.CopyString(s,N));
        N = 0;
        expected = "";
        assertEquals(expected, SP.CopyString(s,N));
        N = -1;
    }
    @Test (expected = IllegalArgumentException.class)
    public void TestCopyStringException() {
        String s = "Hello";
        int N = -1;
        StringProcessor SP = new StringProcessor();
        SP.CopyString(s,N);
    }
    @Test
    public void TestNumberOfOccurrences() {
        String s1 = "Hello";
        String s2 = "l";
        int expected = 2;
        StringProcessor SP = new StringProcessor();
        assertEquals(expected,SP.NumberOfOccurrences(s1,s2));
        String s3 = "asasasa";
        String s4 = "asa";
        expected = 3;
        assertEquals(expected,SP.NumberOfOccurrences(s3,s4));
    }
    @Test
    public void TestReplacement() {
        String s3 = "12345";
        String expected = "одиндватри45";
        StringProcessor SP = new StringProcessor();
        assertEquals(expected, SP.Replacement(s3));
    }
    @Test
    public void TestRemoval() {
        StringBuilder s4 = new StringBuilder("HelloWorld");
        String expected = "Hlool";
        StringProcessor SP = new StringProcessor();
        assertEquals(expected, SP.Removal(s4));
    }
}