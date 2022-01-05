package javaexp.a06_object;

import java.util.ArrayList;

public class A10_ObjVsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchClass sc = new SchClass("쌍용반");
		sc.addSlist(new Student(15,"홍길동"));
		sc.addSlist(new Student(16,"김길동"));
		sc.showStudList();
	}

}
class Student{
	private int sno;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
class SchClass{
	private String schName;
	private ArrayList<Student> slist;
	public SchClass() {
		super();
		slist = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
	}
	public SchClass(String schName) {
		super();
		this.schName = schName;
		slist = new ArrayList<Student>();
	}
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public ArrayList<Student> getSlist() {
		return slist;
	}
	public void setSlist(ArrayList<Student> slist) {
		this.slist = slist;
	}
	public void addSlist(Student st) {
		slist.add(st);
	}
	public void showStudList() {
	      System.out.println(schName+"의 학생정보");
	      if(slist.size()>0) {
	         for(Student st : slist) {
	            System.out.print(st.getSno()+"\t");
	            System.out.println(st.getSname());
	         }
	      }else {
	         System.out.println("학생정보 없음");
	      }
	   }
	
}