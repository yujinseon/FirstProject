package javaexp.a04_vo;

public class EmpSch{
 	private String ename;
 	private String job;
 	private int fr_sal;
 	private int to_sal;
 	private int deptno;
	public EmpSch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpSch(String ename, String job, int fr_sal, int to_sal, int deptno) {
		super();
		this.ename = ename;
		this.job = job;
		this.fr_sal = fr_sal;
		this.to_sal = to_sal;
		this.deptno = deptno;
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
	public int getFr_sal() {
		return fr_sal;
	}
	public void setFr_sal(int fr_sal) {
		this.fr_sal = fr_sal;
	}
	public int getTo_sal() {
		return to_sal;
	}
	public void setTo_sal(int to_sal) {
		this.to_sal = to_sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
 	
 	
}
