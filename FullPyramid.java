import java.util.Scanner;
public class FullPyramid {
	public static void main(String[] sr) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();
	}
}
