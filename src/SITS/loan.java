package SITS;
class student_loan
{
	public void start()
{
System.out.println(" Student loan is $20,000");

}
	}
class credit_loan extends student_loan 
{
	public void bank_of_america()
	{
	System.out.println("Credit card loan is $4000");
	}
	}
class car_loan extends credit_loan
{
	public void my_car_payment()
	{
	System.out.println("BMW loan is $50,000");
	}
	}
class mortgage_loan extends car_loan
{
	public void my_mortgage_payment()
	{
	System.out.println("mortgage loan is $200,000");
	
	}
	}

public class loan {

	public static void main(String[] args) {
	mortgage_loan m=new mortgage_loan();
	m.start();
	m.bank_of_america();
	m.my_car_payment();
	m.my_mortgage_payment();
	System.out.println("-------------------------------------------------------------");
	car_loan c=new car_loan();
	c.start();
	c.bank_of_america();
	c.my_car_payment();
		
	

	}

}
