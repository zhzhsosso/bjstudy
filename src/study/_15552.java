package study;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class _15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
		
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=1;i<=n;i++){
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()))+ "\n");
				
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
