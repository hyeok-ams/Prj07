package ex01;

/*  1번
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

//입력: 번호,이름,국어,영어,수학
//num,name,kor,eng,mat
//출력: 번호,이름,국어,영어,수학,총점,평균,등급
//num,name,kor,eng,mat,tot,avg,grade


class Score{
	//fields
	//입력: 번호,이름,국어,영어,수학
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//출력: 번호,이름,국어,영어,수학,총점,평균,등급
	private int tot;
	private double avg;
	private char grade;

	//생성자 Constructor : new 할 때 초기화
	public Score() {}
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//기능(method:함수) :입력, 처리, 출력
	public void input() {
		
		
	}
	public void process() {
		tot = kor+eng+mat;
		
	}
	public void output() {
		
	}
	
	
	
}


public class TestScore {

	public static void main(String[] args) {
		
		

	}

}
