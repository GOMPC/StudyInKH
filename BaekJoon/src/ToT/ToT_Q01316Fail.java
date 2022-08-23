package ToT;

import java.io.*;
import java.util.*;

public class ToT_Q01316Fail {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cycle = Integer.parseInt(br.readLine());
		int cnt = cycle;
		// aba >> 불이 이미 켜져있다면 전에 값과 확인 >> 전 값과 현재값이 다르면 아웃
		
		for(int i=0;i<cycle;i++) {
			boolean[] boolArr = new boolean[123];
			char[] cNum = br.readLine().toCharArray();
			boolArr[cNum[0]] = true;
			for(int j=1;j<cNum.length;j++) {
				if(boolArr[cNum[j]]) { // 이미 true이고
					if(cNum[j]!=cNum[j-1]) // 전 값이 다른걸?
					cnt--; // 컷~
					break;
					}
				boolArr[cNum[j]] = true;
				}
		}
		
		bw.write(Integer.toString(cnt));
		bw.close();
		
	}
	
}
