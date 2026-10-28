class Solution {
    public boolean isValid(String s) {
        Stack<Character> newStack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '{' || c == '[' || c == '(') {
                newStack.push(c);
            } else {
                if (newStack.isEmpty()) {
                    return false;
                }

                char peekedLetter = newStack.peek();

                if (
                    (c == '}' && peekedLetter == '{') ||
                    (c == ']' && peekedLetter == '[') ||
                    (c == ')' && peekedLetter == '(')
                ) {
                    newStack.pop();
                } else {
                    return false;
                }
            }
        }

        return newStack.isEmpty();
    }
}