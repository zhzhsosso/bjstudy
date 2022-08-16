package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int A;
		int B;
		
		StringTokenizer st;
		
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+ i +": " + A + " + "+ B + " = " + (A+B) +"\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}