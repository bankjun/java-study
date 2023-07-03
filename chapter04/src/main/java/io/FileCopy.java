package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
// 거의 모든 읽기 쓰기의 형식이 비슷할 것이다.
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("gaguri.jpg"); // 프로젝트 파일안에 넣어두면 그 파일 안에서 찾음
			os = new FileOutputStream("gaguri.copy.jpg");
			
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e);
		} catch (IOException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if(is != null) { // 이걸하지 않으면 nullpointException발생할수 있음
					is.close();
				}
				if(os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
