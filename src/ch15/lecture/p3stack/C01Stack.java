package ch15.lecture.p3stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println(stack.size()); // 4

        String item1 = stack.pop(); // css
        String item2 = stack.pop(); // spring
        String item3 = stack.pop(); // react
        String item4 = stack.pop(); // java

        System.out.println(stack.size()); // 0

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
    }
}
