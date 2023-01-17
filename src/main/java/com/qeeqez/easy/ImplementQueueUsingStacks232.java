package com.qeeqez.easy;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * <p>
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * <p>
 * Notes:
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively.
 * You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 */
public class ImplementQueueUsingStacks232 {

    /**
     * Implementation of a Queue using 2 stacks
     * <p>
     * <b>Note:</b> non-standard stack operations like remove(0) and get(0) permitted!
     * Use only default operations like "push", "pop", "peek", "size", "isEmpty"
     */
    static class MyQueue {

        private final Stack<Integer> input;
        private final Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            checkAndFixQueue();
            return output.pop();
        }

        public int peek() {
            checkAndFixQueue();
            return output.peek();
        }

        public boolean empty() {
            return input.empty() && output.empty();
        }

        private void checkAndFixQueue() {
            if (output.empty()) {
                while (!input.empty()) {
                    output.push(input.pop());
                }
            }
        }

        public boolean equals(Stack<Integer> check) {
            checkAndFixQueue();
            if (check.size() != output.size()) return false;

            // Stacks should be rotated now, so we treat first as last
            for (int i = 0, j = output.size() - 1; i < check.size() && j >= 0; i++, j--) {
                if (!output.get(j).equals(check.get(i))) return false;
            }

            return true;
        }
    }

}

