package functions;

public class SmallestAmongThree {

	public static void main(String[] args) {
		
		int first= 25;
		int second= 37;
		int third=29;
		
		if ( first < second & first < third)
		{
		System.out.println("Smallest number is : "+first);
		}
	    if ( second < first & second<third)
	    {
	    System.out.println("Smallest number is :"+ second);
	    }
	    if ( third < second & third<first)
		{
		System.out.println("Smallest number is : "+third);
		}
	}	
}
