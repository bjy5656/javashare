package fortest;
//5번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {
		//for문만 사용 
		//1. 100부터 1까지 출력(tab키로 띄어쓰기) 
		//1) for문 초기식 i = 1, 조건식 i <= 100, 증감식 i++ 
		//2) 중괄호 출력(i와 tab)
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		//2. 구구단 3단만 출력 
		//1) for문 초기식 i = 3, 조건식 i <= 100, 증감식 i+=3
		//2) 중괄호 출력(i와 tab) 
		int dan = 3;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i);	 
		}
		
		System.out.println();
		//3. A ~ F 출력(초기식 char i = 'A') 
		//1) for문 초기식 char i = 'A', 조건식 (int)i <= (int)'F', 증감식 i = (char)(i+1)  
		//2) 중괄호 출력(문자형 i와 tab)
//		for(char i = 'A'; i <= 'F'; i = i++) {
//			System.out.print(i + "\t");
//		}
		
		System.out.println();
		//4. A ~ F 출력(초기식 int i = 0)
		//1) for문 초기식 int i = 'A', 조건식 i <= (int)'F', 증감식 i++
		//2) 중괄호 출력(문자형 i와 tab) 
//		for(int i = 'A'; i <= (int)'F'; i++) {
//			System.out.print((char)i + "\t");
//		}	
		
		System.out.println();
		//5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		//1) 문자형 변수 소문자, 대문자 선언 
		//2) for문 초기식 int i = 0, 조건식 i < 26, 증감식 i+=2
		//3) 중괄호 출력(문자형으로 소문자+i, 대문자+i)
		char lower = 'a', upper = 'B';
		for (int i = 0; i < 26; i += 2) {
			System.out.printf("%c%c", (char)(lower+i), (char)(upper+i));
		}
		
		
		//강사님코드
		
//		//2.
//		int dan = 3;
//		for(int i = 1; i < 10; i++) {
//			System.out.println(dan + " x " + i + " = " + dan * i);
//			 
//		}
		
		//3.
//		for(char i = 'A'; i <= 'F'; i++) {
//			System.out.print(i + " ");
//		}
		
		//4. 
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(i + 65));
//		}
		
		//5.
		
		for(int i = 0; i < 26; i++) {
			if(i % 2 == 0) {
				System.out.print((char)(i + 97));
			} else {
				System.out.print((char)(i + 65));
			}
		}
		System.out.println();
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
		}
		
		System.out.println();
		
		//현재 i의 값 25
		// 	조건식 25 < 26	true, 중괄호 영역 (char)(25 % 2 == 0 false, 25 + 65) => (char)91, 증감식 i++ => 25 + 1
		//현재 i의 값 26
		//	조건식 26 < 26  	false, for문 탈출
		
		
		//첫번재 반복문 
		//초기식 i가 0, 조건식 0 < 26 true, 중괄호영역 (char)(97) => a, 증감식 i++ => 0 + 1
		//현재 i의 값 1 
		//		조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => (char)66 => 증감식 i++ => i = 1 + 1
		//현재 i의 값 2
		// 		조건식 2 < 26 true
	}
}
