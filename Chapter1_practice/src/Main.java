import java.util.Scanner;
import java.math.*;
public class Main {
	public static void problem01() {
		// 1. 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라. 읽어온 정수의 역수를 16진수 부동소수점 수로 출력하라.
		Scanner in = new Scanner(System.in); // 아직 동적할당
		int number = in.nextInt();
		String bi = Integer.toString(number, 2);
		String oc = Integer.toString(number, 8);
		String he = Integer.toString(number, 16);
		System.out.println("2진수: " + bi + "\n8진수: " + oc + "\n16진수: " + he + "\n역수: " + (1.0 / number));
	}
		
	public static void problem02() {
		// 2. 정수(양의 정수 또는 음의 정수)로 된 각도를 읽고 0~359도 사이의 값으로 정규화하는 프로그램을 작성하라.
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n%360);
	}
	
	public static void problem03_1() {
		///// 3. 조건 연산자만 사용해 정수 세 개를 읽고 최댓값을 출력하는 프로그램을 작성하라. Math.max를 사용해 같은 프로그램을 작성하라.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a >= b && a >= c) 
			System.out.println(a);
		else if (b >= a && b >= c)
			System.out.println(b);
		else
			System.out.println(c);
	}
	
	public static void problem03_2() {
		// 3. 조건 연산자만 사용해 정수 세 개를 읽고 최댓값을 출력하는 프로그램을 작성하라. Math.max를 사용해 같은 프로그램을 작성하라.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println(Math.max(a, Math.max(b, c)));
	}
	
	public static void problem04() {
		// 4. double 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라.
		System.out.println("Min: " + Math.nextUp(0.0));
		System.out.println("Max: " + Math.nextDown(Double.POSITIVE_INFINITY));
	}
	
	public static void problem05() {
		// 5. int의 최댓값보다 큰 double을 int 타입으로 변환하면 무슨 일이 일어나는가? 직접 시도해 보라.
		System.out.println((int) 2E30);
	}
	
	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) 
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
	
	public static void problem06() {
		// 6. BigInteger를 사용해 팩토리얼 n!을 계산하는 프로그램을 작성하라. 그리고 프로그램을 이요해 1,000!을 계산하라.
		System.out.println(factorial(1000));
	}
	
	public static void problem07() {
		// 7. 0~4294967295 사이의 정수 두 개를 읽어서 int 변수에 저장한 후 부호 없는 합계, 차이, 곱, 몫, 나머지를 계산해 표시하는 프로그램을 작성하라.
		Scanner in = new Scanner(System.in);
		int a = (int) in.nextLong();
		int b = (int) in.nextLong();
		System.out.println("합계: " + (Integer.toUnsignedLong(a) + Integer.toUnsignedLong(b)));
		System.out.println("차이: " + (Integer.toUnsignedLong(a) - Integer.toUnsignedLong(b)));
		System.out.println("곱: " + BigInteger.valueOf((Integer.toUnsignedLong(a))).multiply(BigInteger.valueOf(Integer.toUnsignedLong(b))));
		System.out.println("몫: " + (Integer.toUnsignedLong(a) / Integer.toUnsignedLong(b)));
		System.out.println("나머지: " + (Integer.toUnsignedLong(a) % Integer.toUnsignedLong(b)));
	}
	
	public static void problem08() {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String temp = in.next();
			System.out.println(temp);
		}
	}
	
	
	public static void main(String[] args) {
		// 1번 문제
//		problem01();
		
		// 2번 문제
//		problem02();
		
		// 3번 문제
//		problem03_1();
//		problem03_2();
		
		// 4번 문제
//		problem04();
		
		// 5번 문제
//		problem05();
		
		// 6번 문제
//		problem06();
		
		// 7번 문제
//		problem07();
		
		// 8번 문제
//		problem08();
		
		// 9번 문제
//		problem09();
		
		// 10번 문제
//		problem10();
		
		// 11번 문제
//		problem11();
		
		// 12번 문제
//		problem12();
		
		// 13번 문제
//		problem13();
		
		// 14번 문제
//		problem14();
		
		// 15번 문제
//		problem15();
		
		// 16번 문제
//		problem16();
		
	}
}
