package WrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int num0 = 10;
		int num1 = 10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num2 == num3 : " + (num2 == num3)); // 주소 값을 비교한다 false
		System.out.println(num2.equals(num3)); // 내용이 같은지 비교할때는 .equals()사용
		
		System.out.println("--------------");
		System.out.println(num1 == num2);// num2가 auto unboxing
		System.out.println(num2.equals(num1));// num1이 auto boxing
		System.out.println("--------------");
		
		String str1 = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);	
		
	}
}
