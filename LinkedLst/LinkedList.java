package LinkedLst;

import java.util.Stack;

public class base {
	class node {
		public node(int ali) {
			data = ali;
		}

		int data;
		node next;
	}

	node head;

	public void disp() { // display data on each node !!
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " =>" + " ");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
	}

	public int size() {
		node tmp = head;
		int cnt = 0;
		while (tmp != null) {
			cnt++;
			tmp = tmp.next;
		}
		return cnt;
	}

	public int getfirst() {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		return head.data;
	}

	public int getlast() {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		node temp = head;
		while (temp.next == null) {
			temp = temp.next;
		}
		return temp.data;
	}

	private node getLnode() {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public int getAt(int i) {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		if (i < 0 || i > size()) {
			throw new IndexOutOfBoundsException();
		}
		node temp = head;
		for (int cnt = 1; cnt <= i; cnt++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public node getAtN(int i) {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		if (i < 0 || i > size()) {
			throw new IndexOutOfBoundsException();
		}
		node temp = head;
		for (int cnt = 1; cnt <= i; cnt++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		node nn = new node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		node last = getLnode();
		last.next = nn;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int ali) {
		node nn = new node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int ali, int idx) {
		if (idx == 0) {
			addFirst(ali);
			return;
		} else if (idx == size()) {
			addLast(ali);
			return;
		}
		if (idx < 0 || idx > size()) {
			throw new IndexOutOfBoundsException();
		}
		node prev = getAtN(idx - 1);
		node nn = new node(ali);
		node after = prev.next;
		prev.next = nn;
		nn.next = after;
	}

	public int removelast() {
		if (size() == 1) {
			int ans = head.data;
			head = null;
			return ans;
		}
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		node second_last = getAtN(size() - 2);
		node last = second_last.next;
		second_last.next = null;
		return last.data;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("khali hai bhyi");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx == 0) {

			return removeFirst();
		} else if (idx == size() - 1) {
			return removelast();
		}
		if (idx < 0 || idx >= size()) {
			throw new IndexOutOfBoundsException();
		}
		node prev = getAtN(idx - 1);
		node curr = prev.next;
		node after = curr.next;
		prev.next = after;
		return curr.data;
	}

	public void rev() { // iterative approach!!
		node curr = head;
		node prev = null;
		while (curr != null) {
			node after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void rev2() {
		node temp = head;
		rev2(head);
		temp.next = null;
	}

	private void rev2(node prev) {
		if (prev.next == null) {
			head = prev;
			return;
		}
		node curr = prev.next;
		rev2(curr);
		curr.next = prev;
	}

	public int getmid() {
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = slow.next.next;
		}
		return slow.data;
	}

	public int lastKdist(int k) {
		node c2 = head;
		for (int i = 0; i < k; i++) {
			c2 = c2.next;
		}
		node c1 = head;
		while (c2 != null) {
			c1 = c1.next;
			c2 = c2.next;
		}
		return c1.data;
	}

	public void Krev(int k) {
		node nn = head;
		Stack<node> s = new Stack<>();
		node last = null;
		node start = null;
		while (nn != null) {
			node after = nn.next;
			s.add(nn);
			if (s.size() == k) { // for k multiple
				while (!s.isEmpty()) {
					node curr = s.pop();
					if (last == null) {
						start = curr;
						last = curr;
					} else {
						last.next = curr;
						last = curr;
					}
				}
			}
			nn = after;
		}
		// if not a multiple of k, remaining elements
		while (!s.isEmpty()) {
			node curr = s.pop();
			if (last == null) {
				start = curr;
				last = curr;
			} else {
				last.next = curr;
				last = curr;
			}
		}

		head = start;
		last.next = null;
	}

	public boolean chainExts() {
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public void break_cycle() {
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		node car1 = head;
		node car2 = slow;
		while (car1.next != car2.next) {
			car1 = car1.next;
			car2 = car2.next;
		}
		car2.next = null;
	}

}
