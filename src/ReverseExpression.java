import java.util.Stack;

public class ReverseExpression {
    public String solution(String expression) {
        if (expression == null || expression.length() <= 1) return expression;
        StringBuilder res = new StringBuilder();

        Stack<Character> operation = new Stack<>();
        Stack<String> numbers = new Stack<>();
        int i = 0;
        while (i < expression.length()) {
            StringBuilder sb = new StringBuilder();
            if (expression.charAt(i) == '-' && (i == 0 || !Character.isDigit(expression.charAt(i - 1)))) {
                sb.append(expression.charAt(i ++));
            }
            while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                sb.append(expression.charAt(i ++));
            }
            numbers.push(sb.toString());
            if (i < expression.length()) {
                operation.push(expression.charAt(i ++));
            }
        }
        res.append(numbers.pop());
        while (!numbers.isEmpty()) {
            res.append(operation.pop());
            res.append(numbers.pop());
        }
        return res.toString();
    }
}
