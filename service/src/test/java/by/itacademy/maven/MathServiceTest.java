package by.itacademy.maven;

import by.itacademy.maven.impl.MathService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MathServiceTest {

    MathService mathService;

    @org.junit.Before
    public void setUp() throws Exception {
        mathService = new MathService();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void average() {
        List<Integer> testData = List.of(1,2);
       // List<Integer> testData2 = List.of(1,null,2);
        List<Integer> testData2 = new ArrayList<>();
        testData2.add(1);
        testData2.add(null);
        testData2.add(2);
        testData2.add(3);
        Double d = mathService.average(testData);
        Double d2 = mathService.average(testData2);
        assertEquals(1.5,d,0);
        assertEquals(2,d2,0);
    }
}