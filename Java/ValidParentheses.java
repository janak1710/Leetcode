import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isOpeningBracks(ch)) {
				stk.push(ch);
			} else if (isClosingBracks(ch)) {
				if (stk.isEmpty() || !matches(stk.peek(), ch))
					return false;
				else
					stk.pop();
			}
		}
		if (!stk.isEmpty())
			return false;
		else
			return true;
	}

	private boolean matches(char top, char ch) {
		if (top == '(' && ch == ')')
			return true;
		else if (top == '{' && ch == '}')
			return true;
		else if (top == '[' && ch == ']')
			return true;
		else
			return false;
	}

	private boolean isClosingBracks(char ch) {
		return (ch == ')' || ch == '}' || ch == ']');
	}

	private boolean isOpeningBracks(char ch) {
		return (ch == '(' || ch == '{' || ch == '[');
	}
}