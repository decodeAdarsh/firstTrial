package com.fileHandling;

import java.io.File;
import java.util.Date;

public class FileDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileName=new File("E:\\IBM_TRAINING\\Direct\\");
		File[] fileList=fileName.listFiles();
		
		for(File file:fileList)
		{
			System.out.println(file.getName());
			System.out.println(file.length());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			System.out.println(new Date(file.lastModified()));
		}
		
	}

}
