import java.util.Scanner;
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card1Type1=new Card(1,"spades");
		Card card2Type1=new Card(1, "clover");
		Card card1Type2=new Card(1,"diamond");
		Card card1Type3=new Card(1,"heart"); 
		Card Lucky=new Card(4,"clover");
		Card card1Type4=new Card(2,"diamond");
		Card card2Type2=new Card(3,"spades");
		Card card2Type21=new Card(2,"clover");
		Card card2Type3=new Card(2,"heart");
		
		System.out.println(card1Type1.Number+card1Type1.Suit);
		System.out.println(card2Type1.Number+card2Type1.Suit);
		System.out.println(card1Type2.Number+card1Type2.Suit);
		System.out.println(card1Type3.Number+card1Type3.Suit);
		System.out.println(Lucky.Number+Lucky.Suit);
		System.out.println(card1Type4.Number+card1Type4.Suit);
		System.out.println(card2Type2.Number+card2Type2.Suit);
		System.out.println(card2Type21.Number+card2Type21.Suit);
		System.out.println(card2Type3.Number+card2Type3.Suit);
		
		
		
		System.out.println("Enter the suit you want");
		Scanner scan1=new Scanner(System.in);
		String Suit=scan1.nextLine(); 
		
		System.out.println("Enter the number you want");
		Scanner scan=new Scanner(System.in);
		int Number=scan.nextInt();
		
		
		if (Suit.equals(Lucky.Suit)&&Number==Lucky.Number){
			System.out.println("You win");
		}else {
			System.out.println("You lose");
		}
	
	}

}
