import java.util.Stack;

public class StackInBuiltExample {
    public static void main(String[] args) {


        // stack is first in last out, the first things that comes to stack goes out last
        // that means last in first out
        // push means insert and pop means remove from the stack

        //  we use stack and heaps when we binary tree traversal and like when we BFS and DFS
        Stack<Integer> stack = new Stack<>();

        stack.push(45);
        stack.push(46);
        stack.push(47);
        stack.push(48);
        stack.push(49);
        stack.push(50);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
