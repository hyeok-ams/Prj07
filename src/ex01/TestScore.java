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
		this.tot = 0;
		this.avg = 0.0;
		this.grade = 'F';
	}
	//getter//setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	//메소드
	public int calcTot() {
		tot = kor+eng+mat;
		return tot;
	}
	public double calcAvg() {
		//avg = tot/3.0 //X 총점을 사용하지 않았을때 0점
		avg= calcTot() / 3.0;
		//위와 같은 결과	avg = (kor+eng+mat)/3.0;
		//return (int)(avg*100 + 0.5)/100;
		return avg;
	}
	public char calcGrade() {
		if(calcAvg() < 60) {
			grade = 'F';
		}
		else if(calcAvg() >= 60 && calcAvg() < 70) {
			grade = 'D';
		}
		else if(calcAvg() >= 70 && calcAvg() < 80) {
			grade = 'C';
		}
		else if(calcAvg() >= 80 && calcAvg() < 90) {
			grade = 'B';
		}
		else if(calcAvg() >= 90 && calcAvg() <= 100) {
			grade = 'A';
		}
		else
			return 'X';

		
		return grade;
	}
	
	//toString : 값 중간 확인용
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	
}


public class TestScore {

	public static void main(String[] args) {
		Score score1 = new Score(1,"사나",70,80,90);
		System.out.println(score1.toString());
		//System.out.println(score1);
		System.out.println("총점:" + score1.calcTot()
		+ "평균:" + score1.calcAvg()
		+ "학점:" + score1.calcGrade());

		Score score2 = new Score(2,"모모",0,70,100);
		System.out.println("번호,이름,국어,영어,수학,총점,평균,등급");
		System.out.printf("%d %s %d %d %d %d %.3f %c" , score2.getNum()
				, score2.getName(), score2.getKor(), score2.getEng()
				, score2.getMat(), score2.calcTot(), score2.calcAvg()
				, score2.calcGrade());
		System.out.println();

		Score score3 = new Score(3,"쯔위",70,90,90);
		System.out.printf("%d %s %d %d %d %d %.3f %c" , score3.getNum()
				, score3.getName(), score3.getKor(), score3.getEng()
				, score3.getMat(), score3.calcTot(), score3.calcAvg()
				, score3.calcGrade());
		System.out.println();

		Score score4 = new Score(4,"정연",80,90,70);
		System.out.printf("%d %s %d %d %d %d %.3f %c" , score4.getNum()
				, score4.getName(), score4.getKor(), score4.getEng()
				, score4.getMat(), score4.calcTot(), score4.calcAvg()
				, score4.calcGrade());
		System.out.println();

		Score score5 = new Score();
		score5.setNum(5);
		score5.setName("원영");
		score5.setKor(90);
		score5.setEng(90);
		score5.setMat(89);
		score5.calcTot();
		score5.calcAvg();
		score5.calcGrade();
		
		System.out.println(score5);
		System.out.println("총점:" + score5.calcTot()
		+ "평균:" + score5.calcAvg()
		+ "학점:" + score5.calcGrade());

		Score score6 = new Score(6,"유진",100,100,100);
		System.out.println("총점:" + score6.calcTot()
		+ "평균:" + score6.calcAvg()
		+ "학점:" + score6.calcGrade());
		
	}

}
