package LinkedLst;

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
			System.out.print(temp.data + " ==>"+" ");
			temp = temp.next;
		}
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
		while (temp.next == null) {
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
}
