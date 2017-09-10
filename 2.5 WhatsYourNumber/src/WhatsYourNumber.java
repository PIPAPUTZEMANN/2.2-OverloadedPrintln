
public class WhatsYourNumber {

	public static void main(String[] args) {
		int number =(int) (Math.random() * 5 + 1);
		System.out.println(number);
		System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
		
		int guess = new java.util.Scanner(System.in).nextInt();
		
		if(number == guess){
			System.out.println("Super getippt!");
			
		}

		System.out.println("Starte das Porgramm noch einmal neu und rate erneut!");
	}

}
