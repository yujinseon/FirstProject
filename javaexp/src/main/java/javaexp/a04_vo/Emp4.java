package javaexp.a04_vo;

public class Emp4 {
	private int empno;
	private String ename;
	private	int deptno;
	private double sal;
	public Emp4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp4(int empno, String ename, int deptno, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.sal = sal;
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
