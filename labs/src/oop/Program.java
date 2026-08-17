package oop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Student stu1 = new Student("Sean", 71);
		System.out.println(stu1.getGrade());

		Student stu2 = new Student("Bob");
		// stu2.name = "WIlma;"
		stu2.mark = 22;
		System.out.println(stu2.getGrade());
	}

	private static int getInt(String prompt) {
		System.out.printf(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private static String getString(String prompt) {
		System.out.printf(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}

class Student {
	private String name; // accessible within class
	int mark; // accessible within package

	public String getName() {
		return name;

	}

	public Student(String name, int mark) {
//        this.name = name;
		this(name); // MUST BE the first line of this constructor
		this.mark = mark;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getGrade() {
		if (mark > 70)
			return "Distinction";
		if (mark > 60)
			return "Merit";
		if (mark >= 50)
			return "Pass";
		return "Fail";
	}
}