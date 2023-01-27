package Self_Training.Design._232_ImplementQueueUsingStacks;

import java.util.Stack;

/*
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support
all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

    - void push(int x) Pushes element x to the back of the queue.
    - int pop() Removes the element from the front of the queue and returns it.
    - int peek() Returns the element at the front of the queue.
    - boolean empty() Returns true if the queue is empty, false otherwise.

Notes:
    - You must use only standard operations of a stack, which means only push to top, peek/pop from top, size,
        and is empty operations are valid.
    - Depending on your language, the stack may not be supported natively. You may simulate a stack
        using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


Example 1:

    Input
    ["MyQueue", "push", "push", "peek", "pop", "empty"]
    [[], [1], [2], [], [], []]
    Output
    [null, null, null, 1, 1, false]

    Explanation
    MyQueue myQueue = new MyQueue();
    myQueue.push(1); // queue is: [1]
    myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    myQueue.peek(); // return 1
    myQueue.pop(); // return 1, queue is [2]
    myQueue.empty(); // return false

 */
class ImplementQueueUsingStacks_EmptyVersion {
    Stack<Integer> input;
    Stack<Integer> output;

    public ImplementQueueUsingStacks_EmptyVersion() {

    }

    public void push(int x) {

    }

    public int pop() {
        return 0;
    }

    // when output stack is empty, move the elements from input stack to output stack
    private void move() {

    }

    public int peek() {
        return 0;
    }

    public boolean empty() {
        return false;
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks_EmptyVersion myQueue = new ImplementQueueUsingStacks_EmptyVersion();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(5);
        myQueue.push(16);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

/**
 * stk1 [ 4, 5
 * stk2 [ 3, 2,
 * queue [ 2, 3,
 */