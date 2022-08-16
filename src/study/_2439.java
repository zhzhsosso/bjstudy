package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) {
			for(int k=1; k<=N-i; k++) {
				bw.write(' ');
			}
			for(int j=1;j<=i;j++) {
				bw.write('*');
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}
