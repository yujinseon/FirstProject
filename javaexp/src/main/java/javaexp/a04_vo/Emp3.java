package javaexp.a04_vo;

public class Emp3 {
	private String dname;
	private String ename;
	private String job;
	private double sal;
	public Emp3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp3(String dname, String ename, String job, double sal) {
		super();
		this.dname = dname;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
