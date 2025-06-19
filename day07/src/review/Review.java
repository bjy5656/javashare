package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
//		int num = -8; 
//		System.out.println(num >> 1);
//		System.out.println(num >>> 1);
//		System.out.println(Integer.toBinaryString(-4));
//		System.out.println(Integer.toBinaryString(-4 >>> 1));
		
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고 
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력 
		
		//1) 입력클래스 import 
		//2) 정수형 변수 선언(입력숫자) 
		//3) 입력메시지 출력, 입력숫자에 입력메소드로 정수 입력받고 저장하기 
		//4) 조건문 (입력숫자가 1보다 크거나 같다 && 입려숫자가 10보다 작거나 같다) => 입력숫자 제곱 출력 
		//5) 그 외 경우 => 잘못 입력했습니다 출력 
		//6) 입력클래스 닫기 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0; 
//		
//		System.out.println("정수를 입력하세요");
//		num = sc.nextInt();
//		
//		if (num >= 1 && num <= 10) {
//			System.out.println("입력하신 수의 제곱 : " + num*num);
//		} else {
//			System.out.println("잘못 입력했습니다.");
//			
//		sc.close(); 
		
		//한글로만 로직구성 
		//1) 입력클래스 import 
		//2) 정수형 변수 
		//3) 출력 메시지 
		//4) 변수 정수형 입력메소드 
		//5) if 조건식 1<= 변수 && 변수 <= 10, 0 < 변수 && 변수 < 11 
			//6) 변수 * 변수 
		//7) else 
			//8) 잘못 입력했습니다 출력 
		//9) sc.close(); 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0; 
//		System.out.println("1부터 10까지의 숫자만 입력하세요");
//		num = sc.nextInt();
//		if ( 1 <= num && num < 11) {
//			System.out.println(num*num);
//			System.out.println(num*2);
//		} else {
//			System.out.println("잘못 입력했습니다");
//		}
//		
//		//문자열끼리의 비교는 관계연산자(==)를 사용하지 않고 
//		//.equals() 메소드를 사용해서 비교한다!!
//		System.out.println("문자열1 읿력 : ");
//		String data1 = sc.nextLine();
//		System.out.println("문자열2 입력 : ");
//		String data2 = sc.nextLine();
//		System.out.println(data1 == data2);
//		System.out.println(data1.equals(data2));
//		if (data1.equals(data2)) {
//			System.out.println("두 문자열 같습니다");
//		} else {
//			System.out.println("두 문자열 같지 않습니다");
//		}
//		
//		sc.close();
		
		//금액과 곡 당 가격을 입력받아 부를 수 있는 곡 수의 잔돈 계산 
		//1) 입력클래스 import 
		//2) 정수형변수 4개 선언 
		//3) 입력메시지 출력 
		//4) 변수1 nextInt() 입력받아 저장 
		//5) 곡 당 가격 입력 메시지 출력 
		//6) 변수2 nextInt() 입력받아 저장 
		//7) if ~ else 문 
			//if문 조건식 변수1 < 변수2 
			//입력한 금액과 부족한 금액 
			//else문 
			//변수3 변수1 / 변수2
			//변수4 변수1 % 변수2 
			//곡 수, 잔돈 
		//8) 스캐너 닫기 
		
//		Scanner sc = new Scanner(System.in);
//		int money = 0, price = 0, song = 0, change = 0; 
//		System.out.println("금액 입력 : ");
//		money = sc.nextInt();
//		System.out.println("곡 당 가격 입력 : ");
//		price = sc.nextInt();
//		if (money < price) {
//			System.out.printf("입력한 금액은 %d원입니다. 한 곡당 가격은 %d 이고 %d원이 부족합니다."
//					, money, price, (price - money));
//		} else {
//			song = money / price; 
//			change = money % price;
//			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다"
//					, song, change);
//		}
//		sc.close(); 
		
		// 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원) 
		// 총 부른 곡 수에 따른 보너스 곡 지급 
		// 5곡을 부르면 1곡 추가 제공 
		
		// 1) 입력클래스 import 
		Scanner sc = new Scanner(System.in);
		// 2) 정수형 상수 2개 선언, 정수형 6개 선언(금액입력, 노랙곡수, 잔돈, 음료마실경우노래곡수, 음료마실경우잔돈, 보너스곡)
		final int PRICE = 200, PRICE_DRINK = 100; 
		int money = 0, song = 0, change = 0, drinkSong = 0, drinkChange = 0, bonus = 0; 
		// 3)  입력 메시지 출력 
		System.out.println("금액 입력 : ");
		// 4) 금액입력 = 금액 입력 nextInt()
		money = sc.nextInt();
		// 5) 노래곡수 = 금액 / 상수1
		
		
	} 
	
}
