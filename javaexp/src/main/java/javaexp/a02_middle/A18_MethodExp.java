package javaexp.a02_middle;

public class A18_MethodExp {

	public static void main(String[] args) {
		Music02 m2 = new Music02("추억은 사랑을 닮아");
		String mName = m2.getMname();
		System.out.println("노래 제목은: " + mName);
		
		Music02 m3 = new Music02("끝 사랑" , "김범수");
		String song = m3.getSong();
		System.out.println(song);
		System.out.println("노래 제목: " + m3.mTitle +"\t" +"가수: " +m3.singer);
	}

}
// ex) Music02 클래스를 선언하고, 생성자를 통해 음악명을 입력하고,
// 		getMname()을 통해 리턴한 음악명을 출력하세요.

class Music02{
	String mTitle;
	String singer;
	
	Music02(String mTitle){
		this.mTitle = mTitle;
	}
	
	Music02(String mTitle, String singer){
		this.mTitle = mTitle;
		this.singer = singer;
	}
	
	String getMname() {
		return mTitle;
	}
	
	String getSong() {
		return mTitle + "\t" +singer;
	}
}