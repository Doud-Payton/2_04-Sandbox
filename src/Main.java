import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String firstname = "Payton";
		String lastname = "Doud";
		System.out.println(firstname + " " + lastname);
		
		int i = 0;
		int j = 8;
		
		System.out.println(i++ + ++j);
		System.out.println(i + j++ + ++j);
		System.out.println(i);
		System.out.println(j);
		
		int loanAmount = 5035;
		double rate = 5	;
		double cost = loanAmount * (rate/100);
		System.out.println("A loan amount for " + loanAmount + " at "+ rate + "% interest per year will cost you $" + cost + " the first year.");
		
		for(i = 0;i<10;i++) {
			System.out.println("i am: " + i);
		}
		System.out.println("i am done");
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <=5; b++) {
				System.out.println(a + " - " + b);
			}
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("What factor?");
		//table(s.nextInt());
		table(5);
		s.close();
		
		String asters = "********";
		String spaces = "          ";
		for(int e = 0;e<=4;e++) {
			System.out.println(spaces.substring(0, e) + asters.substring(0, 4-e) + "*" + asters.substring(0, 4-e) + spaces.substring(0, e));
		}
	}

    public static void table(int factor) {
		for(int c = 1; c <= factor; c++) {
			for(int d = 1; d <= factor; d++) {
				if(c*d%2==1) {
					System.out.print( "O" + c*d + "\t");
				}else {

					System.out.print( "E" + c*d + "\t");
				}
			}
			System.out.println("\n");
		}
    }
}
