import java.util.Scanner;

public class Add3Numbers {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 3 numbers : ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		
		System.out.println("the sum of 3 numbers is : "+(no1+no2+no3));
		
		System.out.println("the average of 3 numbers is : "+((no1+no2+no3)/3));

	}

}
