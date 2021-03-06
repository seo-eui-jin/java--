package staticTest;

import accessTest.Test;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.d); // public만 사용 가능
		t.f4(); // public만 사용가능
		
		
		Korean kim = new Korean("김철수",10);
		Korean park = new Korean("박영희",20);
		
		
		kim.name = "김수정됨";
		System.out.println(kim.name);
		System.out.println(park.name);
		
		kim.country = "USA";
		System.out.println(kim.country);
		System.out.println(park.country);
		
		// 스태틱 변수는 모든 인스턴스(객체)가 값을 공유하기 때문에
		// 인스턴스가 중요하지 않다 따라서 클래스명.변수명으로 사용할 수 있다.
		System.out.println(Korean.country);
		
		kim.show();
		park.show();
		Korean.show(); // 클래스명.메소드명();
		
		
	
		
		
		
		
		
		
		
	}
}
