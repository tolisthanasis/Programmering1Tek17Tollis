package functions;

public class AverageOfThree {

	public static void main(String[] args) {
		
		int first= 25;
		int second= 45;
		int third=65;
		
		if ( first < second & second<third)
		{
		System.out.println("The average value is : "+second);
		}
	    if ( first > second & first<third)
	    {
	    System.out.println("The average value is :"+ first);
	    }
	    if ( third < second & third>first)
		{
		System.out.println("The average value is : "+third);
		}
	}	
}
