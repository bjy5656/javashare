package task;

public class Animal {

	//Animal 클래스 => 3개 객체만들기
    
    //필드 : 동물이름, 나이, 종
    //메소드
    
	
	String name;
	int age;
	String breed;
	
	// 동물이 먹이를 먹는 메소드   매개변수 1개
	//=> 동물이름이 00을 먹습니다
	
	//리턴타입 => void
	//메소드명 => animalEat
	//매개변수 => String (음식)
	//출력(동물이름이 음식을 먹습니다)
	
	void animalEat(String food) {
		System.out.println(name + "(이/가) " + food + "(을/를) 먹습니다");
	}
	
	// 동물이 잠을 잡니다 출력하는 메소드
	// => 동물이름이 잠을 잡니다 출력
	
	//리턴타입 => void 
	//메소드명 => animalSleep
	//매개변수 x
	//출력(동물이름이 잠을 잡니다)
	
	void animalSleep() {
		System.out.println(name + "(이/가) 잠을 잡니다");
	}
	
	// 동물의 생일 축하하는 출력 메소드
	//   => 동물이름의 나이 생일을 축하합니다 출력 
	
	//리턴타입 => void
	//메소드명 => animalHappyBirthday
	//매개변수 x
	//출력(동물이름의 나이 생일을 축하합니다)
	
	void animalHappyBirthday() {
		System.out.println(name + "의 " + age + "세 생일을 축하합니다");
	}
	
}
