//first we import java stack
import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        // then we create an object
        Stack<String> stack = new Stack<String>();

        //here we push strings to our stack using the push method
        stack.push("The Mentalist");
        stack.push("Power");
        stack.push("Pesky Blinders");
        stack.push("Game of Thrones");
        stack.push("Breaking Bad");

        //and we can remove an element using the pop method
        stack.pop();
        System.out.println(stack);


    }
}