package study;

import java.util.Scanner;

public class _8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=1;i<=n;i++){
			result += i;
			
		}
		sc.close();
        System.out.println(result);
	}
}
