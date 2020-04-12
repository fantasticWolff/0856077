//import PriorityQueueTest;

public class TestRunner {
    public static void main(String args[]) {
        //Fail
        //PriorityQueueTest pqt = new PriorityQueueTest(new Integer[]{3, 1, 2}, new Integer[]{1, 2, 4});
        //Pass
        PriorityQueueTest pqt = new PriorityQueueTest(new Integer[]{3, 1, 2}, new Integer[]{1, 2, 3});
        pqt.sum();
    }
}
