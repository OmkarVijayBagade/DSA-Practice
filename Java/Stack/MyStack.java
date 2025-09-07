package Java.Stack;

public class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    //constructor
    public MyStack(int size){
        stack = new int[size];
        capacity = size;
        top -= 1;
    }

    //push
    public void push(int x){
            if (top==capacity-1) {
                System.out.println("Stack Overflow!");
                return;
            }
            stack[++top]=x;
    }

    //pop
    public int pop(){
        if (top==-1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    //peek
    public int peek(){
        if (top == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[top];
    }

    //checking empty
    public boolean isEmpty(){
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.peek()); // 20
    }
}



