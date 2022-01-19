package javaexp.a04_vo;

public class Emp4 {
	private int empno;
	private String ename;
	private int mgrno;
	private double salary;
	public Emp4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp4(int empno, String ename, int mgrno, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.mgrno = mgrno;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getMgrno() {
		return mgrno;
	}
	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
