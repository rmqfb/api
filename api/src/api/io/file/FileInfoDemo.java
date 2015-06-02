package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요");
		String name = ""; // 지역변수는 초기화 해야 됨
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine(); // 한 라인을 읽어들임
		}catch(Exception ex){
			ex.printStackTrace();
		}
		File file = new File(name); // name 초기화 해줘야 됨
		if(file.exists()){
			System.out.println("파일 이름 : " + file.getName());
			System.out.println("파일 경로 : " + file.getPath());
			System.out.println("쓰기가능여부 : " + file.canWrite());
			System.out.println("읽기가능여부 : " + file.canRead());
			System.out.println("파일 길이 : " + file.length() + "바이트");
			
		}else {
			System.out.println("해당 파일이 존재하지 않습니다.");
		}
	}
}


/* 출력 결과
파일 이름을 넣으세요
C:\test.txt  // 내가 절대 경로 입력하기 // 미리 파일을 만들어놓기..
파일 이름 : test.txt
파일 경로 : C:\test.txt
쓰기가능여부 : true
읽기가능여부 : true
파일 길이 : 15바이트
*/