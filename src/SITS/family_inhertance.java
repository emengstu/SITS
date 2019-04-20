package SITS;
class grandpa  
{
	public void start()
	{
	System.out.println("gradpa's gold ");
	
	}
	
	public void stop()
	{
		System.out.println("gradpa's house ");
	}
}	

class father extends grandpa
{
	public void car()
	{
	System.out.println("father's car ;my future car");
	}

}
class me extends father
{
	public void money()
	{
		System.out.println("my money");
	}
} 

public class family_inhertance {
	public static void main(String[] args) {
	System.out.println("I  inherintanced the following:");
me  m=new me();
 m.start();
 m.stop();
 m.car();
 m.money();
 System.out.println("-------------------------------------------");
 System.out.println("Father Inheritanced the following:");
 father f=new father();
 f.start();
 f.stop();
 f.car();
 System.out.println("-------------------------------------------");
 System.out.println("Gradpa ownes the following:");
 grandpa g=new grandpa();
 g.start();
 g.stop();
	}

}

