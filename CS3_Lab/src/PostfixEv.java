public class PostfixEv {

	public static int evaluate(String s) {

		String[] splitted = s.split(" ");

		ArrayStack stack = new ArrayStack(splitted.length);

		int op1, op2;

		for (int i = 0; i < splitted.length; i++) {

			switch (splitted[i]) {

			case "+":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 + op2);
				break;
			case "-":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 - op2);
				break;
			case "*":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 * op2);
				break;
			case "/":
				op2 = stack.pop();
				op1 = stack.pop();
				stack.push(op1 / op2);
				break;
	//			default : stack.push(new Integer(splitted[i]));
			default:
				stack.push(Integer.parseInt(splitted[i]));

			}

		}

		return stack.pop();

	}

	public static ArrayStack decompose(ArrayStack x) {

		ArrayStack odd = new ArrayStack(x.size());
		ArrayStack even = new ArrayStack(x.size());
		int size = x.size();
		for (int i = 1; i <= size; i += 2) {

			odd.push(x.pop());
			if (!x.isEmpty())
				even.push(x.pop());

		}
		size = even.size();
		for (int i = 0; i < size; i++) {

			x.push(even.pop());

		}

		return x;

	}

	public static void removeNth(ArrayStack s, int n) {

		ArrayStack x = new ArrayStack(s.size());

		for (int i = s.size(); i > n; i--) {

			x.push(s.pop());

		}

		s.pop();

		for (int i = x.size(); i > 0; i--) {

			s.push(x.pop());

		}

	}

	public static void main(String[] args) {

		System.out.println(evaluate("2 3 4 - *"));

		ArrayStack s1 = new ArrayStack(8);

		s1.push(6);
		s1.push(9);
		s1.push(3);
		s1.push(5);
		s1.push(4);
		s1.push(1);
		s1.push(2);
		s1.push(7);

		ArrayStack y = decompose(s1);
		y.printStack();

		removeNth(y, 2);
		y.printStack();

	}

}