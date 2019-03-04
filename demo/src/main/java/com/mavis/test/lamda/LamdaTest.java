package com.mavis.test.lamda;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Map;
import java.util.Objects;
import org.junit.Test;

public class LamdaTest {

    @Test
    public void testNull() {
        Predicate isNull = Objects::isNull;
        System.out.println(Predicates.isNull().test(1));
    }

    @Test
    public void testCast() {
        System.out.println(Long.class.cast(1L));
    }

    @Test
    public void testInstance() {
        System.out.println(Long.class.isInstance(Map.class));
    }
}
