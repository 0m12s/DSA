package oops;

public class Queue {
private int []arr;
private int s;
private int size;

public Queue() {
	arr=new int [5];
	s=0;
	size=0;
}
public int size() {
	return size;
}
public boolean isFull() {
	return size==arr.length;
}
public boolean isEmpty() {
	return size==0;
}
public void add(int ali) {
	if(isFull()) {
		throw new RuntimeException("are nhi jagah hai");
	}
	int idx=(size+s)%arr.length;
	arr[idx]=ali;
	size++;
}
public int peek() {
	return arr[s];
}
public int poll() {
	if(isEmpty()) {
		throw new RuntimeException("kuch nhi hai");
	}
	int ans=arr[s];
	size--;
	s++;
	s=s%arr.length;
	return ans;
}
public void display() {
	int idx=s;
	while(idx<s+size) {
		System.out.println(arr[idx]+" ");
		idx++;
	}
	System.out.println();
}
}
