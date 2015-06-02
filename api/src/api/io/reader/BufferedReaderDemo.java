package api.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader in = new BufferedReader(isr);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  // anonymous 형태 와 비슷하다 // anonymous 생성자 처리 : 단 한 번만 쓰고 버리겠다.
		System.out.println("문장을 입력하세요");
		String str = "";
		try{
			str = in.readLine();
		}catch(Exception ex){ex.printStackTrace();}
	}
}
