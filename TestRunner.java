//import PriorityQueueTest;
/*
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
*/
public class TestRunner {
    public static void main(String args[]) {
        //Fail
        //PriorityQueueTest pqt = new PriorityQueueTest(new Integer[]{3, 1, 2}, new Integer[]{1, 2, 4});
        //Pass
        PriorityQueueTest pqt = new PriorityQueueTest(new Integer[]{3, 1, 2}, new Integer[]{1, 2, 3});
        pqt.sum();
    }
}
