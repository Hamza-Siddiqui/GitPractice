package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        ((LinkedList<Integer>) queue).add(3);
        ((LinkedList<Integer>) queue).add(8);
        ((LinkedList<Integer>) queue).add(17);
        ((LinkedList<Integer>) queue).add(9);
        ((LinkedList<Integer>) queue).add(17);
        ((LinkedList<Integer>) queue).add(8);
        ((LinkedList<Integer>) queue).add(3);

        System.out.println(isPalindrome(queue));

    }
    public static boolean isPalindrome(Queue queue){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queueCopy = new LinkedList<>();
        for (int i =0; i<queue.size();i++){
            int temp = (Integer) queue.poll();
            ((LinkedList<Integer>) queueCopy).add(temp);
            queue.add(temp);
            stack.add(temp);
        }

        for (int i = 0; i<queueCopy.size();i++){
            if ((Integer)stack.pop() != (Integer)queueCopy.poll()){
                return false;
            }
        }
        return true;
    }
}
