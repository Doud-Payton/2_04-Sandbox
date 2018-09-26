
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
		
		int loanAmount = 3200;
		double rate = 4;
		double cost = loanAmount * (rate/100);
		System.out.println("A loan amount for " + loanAmount + " at "+ rate + "% interest per year will cost you $" + cost + " the first year.");
	}

}
