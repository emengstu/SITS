package SITS;
class ford
{
	public void start()
	{
	System.out.println("Start the car");
	
	}
	
	public void stop()
	{
		System.out.println("stop the car ");
	}
}	

class bmw extends ford
{
	public void bmw_esp()
	{
	System.out.println("Special future of bmw");
	}

}
class porsche extends bmw
{
	public void porsche_esp()
	{
		System.out.println("esp future porsche");
	}
} 


public class Inheritance {

	public static void main(String[] args) {
porsche  p=new porsche();
 p.start();
 p.stop();
 p.bmw_esp();
 p.porsche_esp();
 System.out.println("-------------------------------------------");
 bmw b=new bmw();
 b.start();
 b.stop();
 b.bmw_esp();
	}
}
	