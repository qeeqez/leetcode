package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class ImplementQueueUsingStacks232Test {

    @Test
    public void testPush1() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1);

        Stack<Integer> outputStack = new Stack<>();
        outputStack.push(1);

        assertTrue(myQueue.equals(outputStack));
    }

    @Test
    public void testPush2() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1);
        myQueue.push(2);

        Stack<Integer> outputStack = new Stack<>();
        outputStack.push(1);
        outputStack.push(2);

        assertTrue(myQueue.equals(outputStack));
    }

    @Test
    public void testPeek() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1);
        myQueue.push(2);

        int peek = myQueue.peek();
        assertEquals(peek, 1);
    }

    @Test
    public void testPop() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1);
        myQueue.push(2);

        int pop = myQueue.pop();
        assertEquals(pop, 1);

        Stack<Integer> outputStack = new Stack<>();
        outputStack.push(2);

        assertTrue(myQueue.equals(outputStack));
    }

    @Test
    public void testEmpty() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();

        assertTrue(myQueue.empty());
    }

    @Test
    public void testNotEmpty() {
        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1);

        assertFalse(myQueue.empty());
    }

    @Test
    public void testCase1() {
        //  ["MyQueue", "push", "push", "peek", "pop", "empty"]
        //  [[], [1], [2], [], [], []]

        ImplementQueueUsingStacks232.MyQueue myQueue = new ImplementQueueUsingStacks232.MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

        int param_2 = myQueue.peek();
        int param_3 = myQueue.pop();
        boolean param_4 = myQueue.empty();

        assertEquals(param_2, 1);
        assertEquals(param_3, 1);
        assertFalse(param_4);
    }
}
