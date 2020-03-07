import java.security.SecureRandom;

public class DiceRoll{
	public static void main(String[] args){
		SecureRandom faceUp = new SecureRandom();
		int[] frequency = new int[7];
		
		System.out.println();
		for(int roll = 1; roll < 6000000; roll++){
			++frequency[1 + faceUp.nextInt(6)];
		}
		System.out.println("FACE\tFREQUENCY");
		for(int face = 1; face < frequency.length; face++){
			System.out.printf("%d\t%d%n",face,frequency[face]);
		}
		System.out.println();
	}
}