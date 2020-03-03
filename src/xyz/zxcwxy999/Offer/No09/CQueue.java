package xyz.zxcwxy999.Offer.No09;

import java.util.Stack;

class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        if (stack1.empty()) stack1.push(value);
        else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    public int deleteHead() {
        if(stack1.empty()){
            return -1;
        }
        return stack1.pop();
    }

    public static void main(String[] args) {
//        CQueue obj = new CQueue();
//        obj.appendTail(3);
//        System.out.println(obj.deleteHead());
//        System.out.println(obj.deleteHead());
        CQueue obj = new CQueue();
        System.out.println(obj.deleteHead());
        obj.appendTail(5);
        obj.appendTail(2);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());

    }
}
