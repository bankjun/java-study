package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			//기반(주)스트림
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조스트림, 보조스트림에 연결
			bos = new BufferedOutputStream(fos);
			// 닫을때는 맨 마지막의 보조스트림만 없애주면 다 닫힘
			
			// for(char c = 'a'; c <= 'z'; c++)
			for(char i = 97; i <= 122; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can Not open: " + e);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
