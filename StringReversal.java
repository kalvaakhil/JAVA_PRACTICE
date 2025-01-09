import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        String actual="capgemini";
        Stack<Character> stack=new Stack<>();
        for(char c:actual.toCharArray())
        {
            stack.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
