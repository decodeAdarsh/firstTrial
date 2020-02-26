package com.fileHandling;

import java.io.File;
import java.io.RandomAccessFile;

public class CrudOpr
{
	private int 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AccountCrud acc=new AccountCrud();
		AccountCrud acc1=new AccountCrud();
		acc.createAcc(111,12000.90,"Suman");
		//acc.readAcc();
		acc.updateAcc(333,1240.90,"sdng");
		acc.readAcc();
		acc1.createAcc(123,435400.67,"Adarsh");
		//acc.readAcc();
		//acc1.readAcc();
		acc1.updateAcc(1333,243240.90,"sflkjgfds");
		acc1.readAcc();
	}
	public static void createAcc(int id,double balance,String name) throws Exception
	{
		
		File file=new File("E:\\IBM_TRAINING\\Direct\\abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		raf.writeInt(id);
		raf.writeDouble(balance);
		raf.writeUTF(name);
		raf.close();
		
		
		
	}
	public static void readAcc()throws Exception
	{
		File file=new File("E:/IBM_TRAINING/Direct/abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"r");
		long currentPosition=raf.getFilePointer();
		raf.seek(0);
		int id=raf.readInt();
		double balance=raf.readDouble();
		String name=raf.readUTF();
		raf.close();
		System.out.println("Account id= "+id+" Balance= "+balance+" Name= "+name);
		
	
	}
	public static void updateAcc(int id,double balance,String name)throws Exception
	{
		File file=new File("E:\\IBM_TRAINING\\Direct\\abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		long currentPosition=raf.getFilePointer();
		raf.seek(currentPosition);
		raf.writeInt(id);
		raf.writeDouble(balance);
		raf.writeUTF(name);
		raf.close();
		
		
	}
	public void deleteAcc()throws Exception
	{
		File file=new File("E:\\IBM_TRAINING\\Direct\\abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		raf.seek(0);
		raf.writeInt(id);
		raf.writeDouble(balance);
		raf.writeUTF(name);
		raf.close();
	}

}
