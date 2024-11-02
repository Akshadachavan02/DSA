package StackandQueue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        
    }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base for valid substring
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }
}
