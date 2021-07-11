import java.util.Arrays;

import sorting.MySortings;
import stacks.MyStack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MyStack<Character> s = new MyStack<>();

        s.push('i');
        s.push('s');
        char ch1 = s.pop();
        System.out.println(ch1);
        System.out.println(s.pop());
        s.push('r');
        char ch2 = s.peek();
        System.out.println(ch2);

    }
}
