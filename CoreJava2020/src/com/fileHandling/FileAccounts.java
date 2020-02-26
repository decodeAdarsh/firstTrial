package com.fileHandling;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;

public class FileAccounts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("E:\\IBM_TRAINING\\Direct\\accounts.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(111);
		dos.writeDouble(12000.98);
		dos.writeUTF("Soman");
		dos.writeInt(222);
		dos.writeDouble(32030.58);
		dos.writeUTF("Boman");
		dos.writeInt(333);
		dos.writeDouble(19084.99);
		dos.writeUTF("Roman");
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		for(int i=0;i<3;i++)
		{	
				int id = dis.readInt();
				double bal = dis.readDouble();
				String name = dis.readUTF();
				System.out.println("Account ID= "+id+" Balance= "+bal+" Name= "+name);
		}
		fis.close();
		dis.close();
	}

}
