package api.io.file;

import java.io.File;

public class MkDirDemo {
	public static void main(String[] args) {
		
		File f = null;
		boolean bool = false;
		
		try{
			// returns pathnames for files and directory
			f = new File("C:/Texts");  // 폴더를 생성한다.
			
			// create
			bool = f.mkdir();
			
			// print
			System.out.println("Directory created?" + bool);
			
		}catch(Exception ex){
			// if any error occurs
			ex.printStackTrace();
			}
	}
}
