package oops;

public class Stack {
private int []arr;
private int tos;

public Stack() {
	arr=new int[5];
	tos=-1;
}
public int size() {
	return tos+1;
}
public boolean isEmpty() {
	return size()==0;
}
public boolean isFull() {
	return size()==arr.length;
}
public void add(int ali) {
	if(isFull() ) {
		throw new RuntimeException("Kha Ghusega bhai ??");
	}
	tos++;
	arr[tos]=ali;
}
public int peek() {
	if(isEmpty() ) {
		throw new RuntimeException("Kya bhai ??");
	}
return arr[tos];
}

public void pop() {
	if(!isEmpty()) {
		System.out.println(arr[tos]);
		tos--;
	}	
}
public void display() {
	int idx=tos;
	while(idx>=0) {
		System.out.println(arr[idx]);
		idx--;
	}
	System.out.println();
}
}
