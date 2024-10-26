import java.util.Scanner;

public class BaiTapGiaiPTBacNhat {

	public static void main(String[] args) {
		// PTBN: a*x + b = 0
		/*
		 * Nếu a == 0
		 * 		Nếu b == 0 => PT có vô số nghiệm
		 * 		Nếu b != 0 => PT vô nghiệm
		 * Nếu a != 0
		 * 		Có nghiệm x = -b/a
		 */
		
		Scanner sc = new Scanner(System.in);
		double a,b,x;
		System.out.println("Nhập a:");
		a = sc.nextDouble();
		System.out.println("Nhập b:");
		b = sc.nextDouble();
		
		if (a==0) {
			if (b==0) {
				System.out.println("PT có vô số nghiệm");
			} else {
				System.out.println("PT vô nghiệm");
			}
		} else {
			x = (-b)/(float)a;
			System.out.println("PT có nghiệm x = " + x);
		}
		
		sc.close();
	}
	
}
