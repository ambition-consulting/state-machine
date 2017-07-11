package com.github.davidmoten.fsm.persistence;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public final class JacksonTest {

    public static final class Example {
        private final String a;
        private final int b;

        public Example(String a, int b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }

    @Test
    @Ignore
    public void testSerialize() {
        byte[] bytes = Serializer.JSON.serialize(new Example("boo", 123));
        System.out.println(new String(bytes));
        Example e = Serializer.JSON.deserialize(Example.class, bytes);
        assertEquals("boo", e.a);
        assertEquals(123, e.b);
    }

}
