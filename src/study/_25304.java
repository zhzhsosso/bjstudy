package study;

import java.util.Scanner;

public class _25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
		
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			result += (a*b);
		}
		
		
		if(X == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
