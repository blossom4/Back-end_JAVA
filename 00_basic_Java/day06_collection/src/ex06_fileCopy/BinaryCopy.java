package ex06_fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Users\\cho82\\Desktop\test.txt");
		File dist = new File("C:\\Users\\cho82\\Desktop\\dist.ini");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int c;	
		try {
			 fis = new FileInputStream(src);
			 fos = new FileOutputStream(dist);
			 bis = new BufferedInputStream(fis);
			 bos = new BufferedOutputStream(fos);
			 
			 while ((c = bis.read()) != -1) bos.write((char)c);
			 
			 System.out.println("���Ϻ��簡 �����߽��ϴ�..");
		} catch (Exception e) {
			System.out.println("���Ϻ��翡 �����߽��ϴ�.");
		} finally {
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
	}

}
