package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class User implements Comparable<User>
{
	private String name;
	private String password;
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public int compareTo(User u) {
		if(this.name.compareTo(u.name)>0) {
			return 1;
		}
		else if (this.name.compareTo(u.name)<0){
			return -1;
		}
		else {
			if(this.password.compareTo(u.password)>0) {
				return 1;
			}
			else if (this.password.compareTo(u.password)<0){
				return -1;
			}
			else 
				return 0;
		}
		}
		
	public  boolean compare(User u) {
			if(this.name.equals(u.name)) {
				return true;
			}
			else {
				return false;
			}
	}

	
}
public class ChatRoomTest {
	
	private static HashMap<String,TreeSet<User>> cRoomUser = new HashMap<>();
	private static HashMap<String,ArrayList<String>> cRoomMsg = new HashMap<String,ArrayList<String>>();
	private static ArrayList<String> msgs=new ArrayList<String>();
	private static TreeSet<User> users=new TreeSet<User>();
	public static void main(String[] args) {
		User use=new User(" "," ");
		String opt;
		Scanner sc=new Scanner(System.in);
				do{
			System.out.println("Options\nA) Create a chatroom\nB) Add the user\nC) User login\nD) Send a message\r\n" + 
				"E) Display the messages from a specific chatroom\r\n" + 
				"F) List down all users belonging to the specified chat room.\r\n" + 
				"G) Logout\r\n" + 
				"H) Delete an user\r\n" + 
				"I) Delete the chat room.\r\n" + "Enter -1 to exit");
				
				System.out.println("Please enter your option:\r\n");
				opt=sc.next();
				switch(opt)
				{
					case "A":
						System.out.println("Enter Chat Room Name");
						String cRoom=sc.next();
						if(cRoomUser.containsKey(cRoom))
						{	System.out.println("ChatRoom Exists Already");
							break;}
						
						cRoomUser.put(cRoom,new TreeSet<User>());
						System.out.println("ChatRoom "+cRoom+" created.\n");
						
						break;
				
					case "B":
						System.out.println("Enter User Name");
						String uName=sc.next();
						System.out.println("Enter Password ");
						String p=sc.next();
						if(users.contains(use.compare(new User(uName,p))))
						{	System.out.println("UserName Exists Already");
							break;}
						users.add(new User(uName,p));
						System.out.println("User ID "+ uName +" created.\n");
				
						break;
					case "C":
						System.out.println("Enter User Name");
						String uName1=sc.next();
						System.out.println("Enter Password ");
						String p1=sc.next();
						if(users.contains(new User(uName1,p1)))
						{	
							System.out.println("Login Completed");
						}
						else
							System.out.println("Wrong Credentials entered.");
							
				
						break;
						
			
				}
				
		}while(!(opt.equals("-1")));
		
	}
	
}
