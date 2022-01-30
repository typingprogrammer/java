import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        // last in, first out.

        Stack<Integer> integerStack = new Stack<>();

        // add, delete, view, contains, size

        /*

        9
        1
        2

         */

        //insert
        integerStack.push(2);
        integerStack.push(1);
        integerStack.push(9);
        integerStack.push(0);

        System.out.println(integerStack);

        System.out.println(integerStack.pop());
        System.out.println(integerStack);

        System.out.println(integerStack.peek());
        System.out.println(integerStack);

        //recursion - function calls itself
    }
}
