public class Lab4 {

	public static int precedence(char c) {

		switch(c) {

		case '*': return 2;
		case '/': return 2;
		case '+': return 1;
		case '-': return 1;
		default: return 0;

		}

	}
	
	public static String infixToPost(String infix) {
		
		StackObj s = new StackObj(infix.length());
		String r = "";
		for(int i = 0; i < infix.length(); i++) {
			if(infix.charAt(i) >= '0' && infix.charAt(i) <= '9')
				r += infix.charAt(i);
			else {
				while(!s.isEmpty()) {
					if(precedence((char) s.top()) >= precedence(infix.charAt(i)))
							r += s.pop();
					else
						break;
				}
				s.push(infix.charAt(i));
			}
		}
		while(!s.isEmpty())
			r += s.pop();
		return r;
		
	}

	public static String infixToPostfix(String infix) {

		StackObj s = new StackObj(10);

		String res = "";

		for(int i = 0; i<infix.length();i++) {

			switch(infix.charAt(i)) {

			case '0': res += '0';break;
			case '1': res += '1';break;
			case '2': res += '2';break;
			case '3': res += '3';break;
			case '4': res += '4';break;
			case '5': res += '5';break;
			case '6': res += '6';break;
			case '7': res += '7';break;
			case '8': res += '8';break;
			case '9': res += '9';break;
			case '*': 

				if(s.isEmpty()){

					s.push('*');

				}

				else if(precedence('*')>precedence((char)s.top())) {

					s.push('*');

				}
				else {

					res += (char)s.pop();
					s.push('*');

				};break;

			case '/': 

				if(s.isEmpty()){

					s.push('/');

				}

				else if(precedence('/')>precedence((char)s.top())) {

					s.push('/');

				}
				else {

					res += (char)s.pop();
					s.push('/');

				};break;

			case '+': 
				while (!s.isEmpty()) {
					if(precedence('+')>precedence((char)s.top())) {

						break;

					}
					else {

						res += (char)s.pop();

					}
				}
				s.push('+');

//				if(s.isEmpty()){
//
//					s.push('+');
//
//				}
//
//				else if(precedence('+')>precedence((char)s.top())) {
//
//					s.push('+');
//
//				}
//				else {
//
//					res += (char)s.pop();
//					s.push('+');

//				};
				break;

			case '-': 

				if(s.isEmpty()){

					s.push('-');

				}

				else if(precedence('-')>precedence((char)s.top())) {

					s.push('-');

				}
				else {

					res += (char)s.pop();
					s.push('-');

				};break;

			}

		}
		while(!s.isEmpty())
			res += s.pop();

		return res;

	}

	public static StackObj createDuplicates(StackObj strings, StackObj integers) {

		if(strings.size() == integers.size()) {

			StackObj newStack = new StackObj(100);

			String tempString;

			while(!(strings.isEmpty()) && !(integers.isEmpty())) {

				tempString = (String)strings.pop();

				for(int i = (Integer)integers.pop(); i>0; i--) {

					newStack.push(tempString);

				}

			}

			return newStack;

		}
		else {

			System.out.println("Sizes aren't equel!");
			return strings;

		}

	}

	public static void main (String[] args) {

		String infixString = "1+2*3+4";

		System.out.println(infixToPostfix(infixString));

		StackObj s1 = new StackObj(3);
		StackObj s2 = new StackObj(3);

		s1.push("Slim");
		s1.push("Abdellatif");
		s1.push("Hend");

		s2.push(2);
		s2.push(3);
		s2.push(1);

		(createDuplicates(s1, s2)).printStack();
		System.out.println(infixToPost(infixString));

	}

}
