package javaexp.a04_vo;
//javaexp.a04_vo.Season
public class Season {
	private String season;
	private String weather;
	private String term;
	public Season() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Season(String season, String weather, String term) {
		super();
		this.season = season;
		this.weather = weather;
		this.term = term;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	
	
}
