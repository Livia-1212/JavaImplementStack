//Livia's version Circular Queue

import java.util.NoSuchElementException;

public class CirQueue {

    int front, rear;
    int[] nums;
    int size;
    final int CAPACITY;
    int temp;

    public CirQueue(int initialSize) {
        this.nums = new int[initialSize];
        this.front = this.rear = -1;
        size = 0;
        CAPACITY = initialSize;
    }


    public void enqueue(int data) {
        if (isEmpty()) {
            front++;
        }

        if(isFull()) {
            System.out.println("queue is full.");
            rear = (rear + 1) % nums.length;
            nums[rear] = data;
            size = 0;
        }else{
            rear = (rear + 1) % nums.length;
            nums[rear] = data;
            size++;

        }

    }



    public int dequeue() {
        if (isEmpty()) {
            size = 0;
            return size;
        }else {
            int temp = nums[front];
            front = (front + 1) % nums.length;
            size--;

            return temp;
        }
    }

    public int getSize() {
        if (isEmpty())
            return 0;
        else return nums.length;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return nums[front];
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        if(rear>0)
            return (rear + 1) % nums.length == front;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("queue is empty.");
        }
        StringBuilder kb = new StringBuilder();
        kb.append("[");
        for (int i = front; i < rear + 1; i++) {
            kb.append(nums[i]);
            if (i < rear ) {
                kb.append(", ");
            }
        }
        kb.append("]");
        System.out.println("The current full queue is: ");
        return kb.toString();
    }

    public int getCAPACITY() {
        return CAPACITY;
    }


}
