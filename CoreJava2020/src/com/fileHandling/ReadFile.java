package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("E:\\IBM_TRAINING\\pqr.txt");
		File file2=new File("E:\\IBM_TRAINING\\rqp.txt");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=new FileOutputStream(file2);
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do {
			i=fis.read();
			if(i!=-1) {
				sb.append((char)i);
				System.out.print((char)i);
			}
		}while(i!=-1);
		String strData=sb.toString();
		System.out.println("strData = " + strData);
		fos.write(strData.getBytes());
		System.out.println(strData);
		fos.flush();
		fos.close();
	
		fis.close();
		
	}

}
