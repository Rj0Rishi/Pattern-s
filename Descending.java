import java.util.Scanner;
public class Descending {
	public static void main(String[] sr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		 for(int i=n;i>0;i--) {
			 for(int j=n;j>=i;j--) {
				 System.out.print(j);
			 }System.out.println();
		 }
		 sc.close();
	}
}
