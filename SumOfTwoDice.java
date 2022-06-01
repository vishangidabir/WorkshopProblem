package workshop;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dice = 6;
		double sum = 0;
		double a = 1 + (Math.random()*dice);
		double b = 1 + (Math.random()*dice);
		sum = a + b;
		System.out.println("Sum of Two Dice :"+sum);
	}

}
