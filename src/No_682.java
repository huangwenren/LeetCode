import java.util.Stack;

/**
 * Created by huang on 2017/10/4.
 */
public class No_682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String op : ops) {
            if (op.equals("C")) {
                total -= stack.pop();
                continue;
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
                total += stack.peek();
                continue;
            } else if (op.equals("+")) {
                stack.push(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
                total += stack.peek();
                continue;
            } else {
                stack.push(Integer.valueOf(op));
                total += stack.peek();
            }
        }
        return total;
    }

}
