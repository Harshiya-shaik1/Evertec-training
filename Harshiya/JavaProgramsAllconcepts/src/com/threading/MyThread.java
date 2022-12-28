package com.threading;
  

class Hii extends Thread{
	//public void show()
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}

class Helloo extends Thread{
	//public void display()
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
}
class MyThread{
	public static void main(String[] args)
	{
		Hii obj3=new Hii();
		
		Helloo obj4=new Helloo();
		
		 obj3.start();
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
		}
		obj4.start();
		
	}
}

















