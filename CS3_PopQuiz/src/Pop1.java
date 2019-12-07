public class Pop1 {

	public static void removeEven(ArrayStack s) {
		
		ArrayStack helper = new ArrayStack(s.size());
		ArrayStack res = new ArrayStack(s.size());
		
		while(!(s.isEmpty())) {
			
			if(((Integer)s.top())%2 == 0) {
				
				helper.push(s.pop());
				
			}
			else {
				
				res.push(s.pop());
				
			}
			
		}
		
		while(!(res.isEmpty())) {
			
			s.push(res.pop());
			
		}
		
	}
	
	public static void main(String [] args) {
		
		ArrayStack stack = new ArrayStack(6);
		
		stack.push(3);
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(5);
		
		stack.printStack();
		
		removeEven(stack);
		
		stack.printStack();
		
	}
	
}
