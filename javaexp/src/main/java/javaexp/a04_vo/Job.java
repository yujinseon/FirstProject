package javaexp.a04_vo;

public class Job {
	private String dname;
	private String ename;
	private String job;
	private int sal;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String dname, String ename, String job, int sal) {
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
