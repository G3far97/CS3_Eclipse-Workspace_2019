
public class SQueueObj {

	private int maxsize;
	private int front;
	private int rear;
	private int nItems;
	private StackObj elements;

	public SQueueObj(int maxSize) {

		this.maxsize = maxSize;
		front = 0;
		rear = -1;
		nItems = 0;
		elements = new StackObj(maxSize);

	}

	public void enqueue(Object x)
	{
		if(rear == maxsize - 1)
			rear = -1;

		rear++;
		elements.push(x);
		nItems++;
	}

	public Object dequeue()
	{

		StackObj helper = new StackObj(maxsize);

		while(!(elements.isEmpty())) {

			helper.push(elements.pop());

		}

		Object result = helper.pop();

		while(!(helper.isEmpty())) {

			elements.push(helper.pop());

		}

		front++;

		if(front == maxsize)
			front = 0;

		nItems--;
		return result;
	}
	
	public Object peek(){
		
		return elements.top();
	
	}
	
	public boolean isEmpty(){
		
		return (nItems == 0);
	
	}
	
	public boolean isFull(){
		
		return (nItems == maxsize);
	
	}
	
	public int size(){
		
		return nItems;
	
	}
	
	public void printQueue() {
	
		if(nItems == 0){
		
			System.out.println("The queue is empty!");
			return;
		
		}
		
		StackObj helper = new StackObj(maxsize);
			
			while(!(elements.isEmpty())) {

				helper.push(elements.pop());

			}

			while(!(helper.isEmpty())) {

				elements.push(helper.pop());

			}
			
		System.out.println();
	
	}

}
