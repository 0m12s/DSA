package oops;

public class Student {
//	data members!!
	// parsing
	private String Name = "pungu";
	private int Age = 1;

	Student() {
	}

	Student(String Name) {
		this.Name = Name;
	}

	public Student(int i, String str) {
		// TODO Auto-generated constructor stub
		Age = i;
		Name = str;
	}

	// functions
	public void Intro() {
//		System.out.println(this);
//		System.out.println("Hi my name is " + Name + " my age " + Age);
		System.out.println("Hi my name is " + this.Name + " my age " + this.Age);

	}

	public void Party(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}

// getter functions
	public int getAge() {
		return this.Age;
	}

	public String getName() {
		return this.Name;
	}

//	setter functions
	public void setAge(int ali) {
		if (ali < 0) {
			throw new RuntimeException("bhai kya?");

//			throw new Exception("bhai kya?");
		}
		this.Age = ali;
	}
}
