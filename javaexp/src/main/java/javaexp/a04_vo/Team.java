package javaexp.a04_vo;
// javaexp.a04_vo.Team
public class Team {
	private String tname;
	private int vic;
	private int equ;
	private int def;
	// 매개변수가 없는 생성자.
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Team(String tname, int vic, int equ, int def) {
		super();
		this.tname = tname;
		this.vic = vic;
		this.equ = equ;
		this.def = def;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getVic() {
		return vic;
	}
	public void setVic(int vic) {
		this.vic = vic;
	}
	public int getEqu() {
		return equ;
	}
	public void setEqu(int equ) {
		this.equ = equ;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
}
