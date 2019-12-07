public class Lab5 {

	public static void shiftZeroes(QueueObj q) {
		
		StackObj stack = new StackObj(q.size());
		
		int s = q.size();
		
		for(int i = 0; i < s; i++) {
			
			if(((Integer)q.peek()).equals(0)) {
				
				stack.push(q.dequeue());
				
			}
			else {
				
				q.enqueue(q.dequeue());
				
			}
			
		}
		
		while(!(stack.isEmpty())) {
			
			q.enqueue(stack.pop());
			
		}
		
	}
	
	public static void main(String [] args) {
		
		QueueObj q = new QueueObj(10);
		
		q.enqueue(5);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(0);
		q.enqueue(0);
		q.enqueue(6);
		q.enqueue(1);
		q.enqueue(0);
		
		q.printQueue();
		
		shiftZeroes(q);
		
		q.printQueue();
		
	}
	
}
