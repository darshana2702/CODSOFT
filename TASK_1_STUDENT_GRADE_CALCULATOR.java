package Task1;

import java.util.Scanner;

public class Student_Management {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Math marks: ");
		int math=sc.nextInt();
		System.out.println("Enter Physics marks: ");
		int phy=sc.nextInt();
		System.out.println("Enter Biology marks: ");
		int bio=sc.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int che=sc.nextInt();
		System.out.println("Enter English marks: ");
		int eng=sc.nextInt();
		int totalMarks=math+phy+bio+che+eng;
		System.out.println("Total Marks Obtain: "+totalMarks);
		double averagePercentage=totalMarks/5;
		System.out.println("Average marks is :"+averagePercentage);
		if(averagePercentage>75) {
			System.out.println("A Grade");
		}
		else if((averagePercentage>60)&&(averagePercentage<75)) {
			System.out.println("B Grade");
		}
		else if((averagePercentage>=45)&&(averagePercentage<60)) {
			System.out.println("C Grade");
		}
		if(averagePercentage>=45) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
