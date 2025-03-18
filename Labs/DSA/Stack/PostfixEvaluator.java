import java.util.Stack;
import java.util.Scanner;
public class PostfixEvaluator {
    private final static char ADD = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';

    private Stack<Integer> stack;

    public PostfixEvaluator() {
        stack = new Stack<Integer>();
    }

    public int evaluate(String expr) {
        int op1, op2, result = 0;
        String token;
        Scanner in = new Scanner(expr);

        while (in.hasNext()) {
            token = in.next();
            if (isOperator(token)) {
                op2 = stack.pop().intValue();
                op1 = stack.pop().intValue();
                result = evaluateSingleOperator(token.charAt(0), op1, op2);
                stack.push(result);
            } else
                stack.push(Integer.parseInt(token));
        }

        return result;
    }

    private boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/"));
    }
    private int evaluateSingleOperator(char operation, int op1, int op2)
    {
        int result = 0;

        switch (operation)
        {
            case ADD:
                result = op1 + op2;
                break;
            case SUBTRACT:
                result = op1 - op2;
                break;
            case MULTIPLY:
                result = op1 * op2;
                break;
            case DIVIDE:
                result = op1 / op2;
        }
        return result;
    }

}
