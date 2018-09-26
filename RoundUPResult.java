package variableridentifierare;

public class RoundUPResult {

	public static void main(String[] args) {
		double i = 5; 
		double j = 25;
		
		
		double k = j*i;
		double l = (int) Math.ceil(k);
		
		System.out.println(l);
	}

}
