package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] N = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N.length;i++) {
			N[i] = Double.parseDouble(st.nextToken());
		}
		

		double sum =0;
		
		Arrays.sort(N);
		
		for(int i =0;i<N.length;i++) {
			sum += ((N[i]/N[N.length-1])*100);
		}
		System.out.println(sum/N.length);
		
	}

}
