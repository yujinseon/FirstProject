package javaexp.a04_vo;
// javaexp.a04_vo.BaseballPlayer
public class BaseballPlayer {
	private String name;
	private String pos;
	private String team;
	private int score;
	public BaseballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseballPlayer(String name, String pos, String team, int score) {
		super();
		this.name = name;
		this.pos = pos;
		this.team = team;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
