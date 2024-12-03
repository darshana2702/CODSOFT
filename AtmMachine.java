package Task2;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User obj=new User(5000);
		System.out.println("Enter Choice: ");
		int ope=0;
		while(ope!=4) {
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Select Your Choice");
			ope=sc.nextInt();
		
		switch(ope) {
		case 1:
			System.out.println("Enter amount to withdraw: ");
			double withdrawAmount=sc.nextDouble();
			System.out.println(obj.withdraw(withdrawAmount));
			break;
		case 2:
			System.out.println("Enter amount to deposit: ");
			double depositAmount=sc.nextDouble();
			System.out.println(obj.withdraw(depositAmount));
			break;
		case 3:
			System.out.println(obj.checkBalance());
			break;
		case 4:
			System.out.println("Thank you");
			break;
			default:
				System.out.println("Invalid operation .select correct option.");
		}

	}
	}
}
