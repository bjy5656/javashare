package methodTest;

public class MethodTask02 {
	public static void main(String[] args) {
		
		MethodTask02 mt = new MethodTask02();
		
		System.out.println("=====1번=====");
		System.out.println(mt.checkNum(5));
		
	}

	// 1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
	// 메소드명 : checkNum

	//로직구성
	//1) 리턴타입 => void
	//2) 메소드명 => checkNum 
	//3) 매개변수 => int형 1개 
	//4) 실행할문장 => 
	//	 삼항연산자 사용 => 입력정수 % 2 == 0 ? 짝수입니다 반환 : 홀수입니다 반환 
	//5) 리턴타입 수정 => String 
	
	String checkNum(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
	// 메소드명 : getSum

	//로직구성 
	//1)리턴타입 => void
	//2)메소드명 => getSum
	//3)매개변수 => int[] 1개 
	//4)실행할문장 => 
	//if문 => 배열길이 == 10 일때 실행 
	//	정수형 변수 선언(총합)
	//	for~each문 사용 
	//		총합 += 반복문변수;
	//	총합+"" 반환 
	//else문 
	//	"배열길이가 10이 아닙니다" 반환 
	//5)리턴타입 => String 
	

	
	
	
	// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	// 메소드명 : reverseStr
	// hello => olleh

	// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
	// 메소드명 : contains
	// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
//      syso(메소드명(배열명, 10)) => true

	// 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
	// 메소드명 : printGugudan
	// 3 x 1 = 3
	// ...
	// 3 x 19 = _

	// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	// 메소드명 : compareLength

	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	// loginTry

}
