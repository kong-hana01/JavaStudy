import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
	// 가변 인수
	public static double average(double... values) {
		double sum = 0;
		for (double v: values) sum += v;
		return values.length == 0 ? 0 : sum / values.length;
	}
	
	
	
	// 첫번째 자바 프로그램
	public static void main(String[] args) {
		Random generator = new Random();
		String location = "Java";
		String name = String.join(" ", "Choi", "Hanbin");
		System.out.println("Hello, World");
		System.out.println(generator.nextInt());
		System.out.println(generator.nextInt());
		System.out.println(Math.pow(1, 2));
		System.out.println(location + 1111);
		System.out.println("My name is " + name);
		System.out.println(name.split(" ")[1]);
		
		int n = 42;
		String str = Integer.toString(n);
		System.out.println(str); // 42
		
		String str2 = Integer.toString(n, 2);
		System.out.println(str2); // 101010
		
		
		// input
//		Scanner in = new Scanner(System.in);
//		String line = in.nextLine(); // 한줄 입력
//		String firstName = in.next(); // 공백으로 구분된 단어
//		int age = in.nextInt(); // 정수 입력
//		System.out.println(age);
		
		// array
		System.out.println("------------");
		String[] names2 = new String[100];
		
		// ArrayList
		ArrayList<String> friends;
		// friends = new ArrayList<>();
		ArrayList<String> friends2 = new ArrayList<>(List.of("Peter", "Paul"));
		
		// 값 채우기
		int[] numbers = new int[10];
		Arrays.fill(numbers, 0); // int[] 배열
		Collections.fill(friends2, ""); // ArrayList<String>  
		
		// sort
		Arrays.sort(numbers);
		Collections.sort(friends2);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("평균값:" + average(1, 4.5, -5, 0));
	}

}
