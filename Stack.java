import java.util.Scanner;

public class Stack {
    // Instance variables
    private int maxSize; // size of the stack
    private int[] stackArray; //store elements of stak
    private int top; //represent top of the stack

    // Constructor to initialize the stack with an array of size 5
    public Stack(int size) {
        stackArray = new int [size];
        maxSize = size;
        top = -1;
    }

    // push elements to the top of the stack
    public void push(int first) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + first);
        } else {
            System.out.println("Pushed " + first + " to the stack.");
            stackArray[++top] = first;
        }
    }

    // pop elements out from the top of the stack
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty. Cannot pop any value.");
        } else {
            int last = stackArray[top];
            return stackArray[top--];
            System.out.println("Poped value: " + last);
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, no item to peek.");
        }else{
            System.out.println("Top item is "+ stackArray[top]);
        }
    }


    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public void size() {
        int n = 0;
        if (isEmpty()){
            System.out.println("Stack is empty. ");
        } else {
            for (int i=0; i<=top; i++){
                n = n + i;
                if (top == maxSize - 1)
                    break;
            }
            System.out.println("The size of the stack is: " + n);

        }
    }


}

