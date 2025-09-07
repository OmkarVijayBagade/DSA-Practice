// Evaluate Postfix Expression
// Problem

// Given a postfix expression (Reverse Polish Notation),
// evaluate the expression and return its value.

// Valid operators: +, -, *, /
// Operands are integers.
// Example

// Input: ["2", "1", "+", "3", "*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9

package Java.Stack;

import java.util.Stack;

public class PostfixExpression {
    public static int evaluatePostfix(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(a,b,token);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*");
    }
    private static int applyOperator(int a, int b, String op){
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
        }
        return 0;
    }
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println("Result: " + evaluatePostfix(tokens));  
    }
}
