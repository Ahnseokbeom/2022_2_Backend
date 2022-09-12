package net.skhu.dto;

public class Student {
	String name;
	int no;
	int sNo;
	public Student() {}
	public Student(String name, int no, int sNo) {
		this.name=name;
		this.no=no;
		this.sNo=sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	

}
