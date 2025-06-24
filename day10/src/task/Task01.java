package task;
//메소드 문제
public class Task01 {
	
	public static void main(String[] args) {
		
		Task01 m = new Task01();
		
		System.out.println("=====1번=====");
		m.countWord("안녕하세요 저는 백정이입니다 java 공부 중입니다");
	}
	
	//1. 문자열 속의 단어를 공백 기준으로 세기 
	//메소드명 : countWord
	//매개변수 : String str 
	//ex) I love java	=> 3개 
	//ex) 안녕하세요 저는 백정이입니다 java 공부 중입니다 => 6개 
	
	//로직구성 
	//리턴타입 => void 
	//실행할문장 => 
	//정수형 변수 선언(공백 개수), 기본값 0 대입 
	//for문 => int i=0; i<문장길이; i++
	//	if문 => 문장의 각 문자가 공백이면 실행
	//		공백개수++
	//for문 종료 
	//출력(단어의 개수 : 공백개수 + 1) 
	
	void countWord(String str) {
		int wordCount = 0; 
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				wordCount++;
			}
		}
		System.out.println("단어의 개수 : " + (wordCount + 1));
	}
	
	//2. 주민등록번호로 성별 판단하기 
	//메소드명 : getGender 
	//1, 3 => 남자 
	//2, 4 => 여자 
	
	
	
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 각 학생별 학점 구하여(정수형)
	//		각 학생별 학점 구하기 
	//메소드명 : getGrade 
	// 95점 이상 A+
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F
	
	
}
