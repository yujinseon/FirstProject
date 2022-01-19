package javaexp.a04_vo;

public class LocSalSch {
	private String loc;
	private int fr_sal;
	private int to_sal;
	public LocSalSch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocSalSch(String loc, int fr_sal, int to_sal) {
		super();
		this.loc = loc;
		this.fr_sal = fr_sal;
		this.to_sal = to_sal;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
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
	
}
