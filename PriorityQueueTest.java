package Lab4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PriorityQueueTest {
    PriorityQueue pq = new PriorityQueue<>();

    Integer[] input;
    Integer[] expect;
    public PriorityQueueTest(Integer[] input, Integer[] expect){
        this.input = input;
        this.expect = expect;
    }

    @Parameters
    public static Collection compare(){
        return Arrays.asList(new Integer[][][]
                {
                        { {3, 1, 2}, {1, 2, 3} },
                        { {1, 1, 2}, {1, 1, 2} },
                        { {3, 0, 2}, {0, 2, 3} },
                        { {11, 1, 2}, {1, 2, 11} },
                        { {3, -1, 2}, {-1, 2, 3} }
                });
    }

    @Test
    public void sum(){
        pq.addAll(Arrays.asList(input));
        for(int i=0; i<input.length; i++){
            assertEquals(pq.poll(), expect[i]);
        }
    }

    @Test(expected = NullPointerException.class)
    public void e1(){
        pq.addAll(null);
    }

    Integer[] a1;
    @Test(expected = NullPointerException.class)
    public void e2(){
        //Integer[] a1 = {null};
        PriorityQueue pq2 = new PriorityQueue(Arrays.asList(a1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void e3(){
        pq.addAll(pq);
    }
}

