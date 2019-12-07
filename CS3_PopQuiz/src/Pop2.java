public class Pop2 {

	public static boolean isPalindrome(LinkList l) {
		if(l.isEmpty()) {
			return true;
		}
		while(l.getFirst() != null && l.getLast() != null) {
			if(l.getFirst().equals(l.getLast())) {
				l.removeFirst();
				l.removeLast();
			} else
			return false;
		}
		return true;
	}

	public static void main (String[] args) {
		LinkList l = new LinkList();
		l.insertLast('r');
		l.insertLast('a');
		l.insertLast('a');
		l.insertLast('r');
	}
}
