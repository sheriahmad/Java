import java.util.Hashtable;
import java.util.LinkedList;

public class Task {

	public static void deleteDups2(LinkedListNode head) {
		if (head == null)
			return;
		LinkedListNode previous = head;
		LinkedListNode current = previous.next;
		while (current != null) {
			LinkedListNode runner = head;
			while (runner != current) { // Check for earlier dups
				if (runner.data == current.data) {
					LinkedListNode tmp = current.next; // remove current
														// previous.next = tmp;
					current = tmp; // update current to next node break; // all
									// other dups have already been removed
				}
				runner = runner.next;
			}
			if (runner == current) { // current not updated - update now
										// previous = current;
				current = current.next;
			}
		}
	}

	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(3);
		list.addLast(3);
		list.addLast(4);
		list.addLast(4);
		System.out.println(list);
		LinkedListNode head = new LinkedListNode(list.getFirst());

	}
}