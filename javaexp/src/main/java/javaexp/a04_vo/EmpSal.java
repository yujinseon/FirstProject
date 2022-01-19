package javaexp.a04_vo;

public class EmpSal {
	private String ename;
	private String grade;
	private double sal;
	public EmpSal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpSal(String ename, String grade, double sal) {
		super();
		this.ename = ename;
		this.grade = grade;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
