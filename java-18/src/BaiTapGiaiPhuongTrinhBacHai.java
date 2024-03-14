import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {

	public static void main(String[] args) {
		// Phương trình bậc 2: a*(x^2) + b*x + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta
		/*
		 * Nếu a == 0 thì báo lỗi. 
		 * B1. delta = b^2 - 4ac 
		 * B2. Kiem tra delta
		 * 	2.1. delta < 0 => Phương trình vô nghiệm 
		 * 	2.2. delta == 0 => Phương trình có nghiệm kép x1 = x2 = -b/2a 
		 * 	2.3. delta > 0 => Phuong trình có 2 nghiệm x1 = (-b-sqrt(delta))/(2a); x2 = (-b+sqrt(delta))/(2a)
		 */
		
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("Nhập vào số a:");
		a = sc.nextDouble();
		System.out.println("Nhập vào số b:");
		b = sc.nextDouble();
		System.out.println("Nhập vào số c:");
		c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x1 = (-b)/(2 * a);
				x2 = x1;
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
			} else {
				x1 = (-b - Math.sqrt(delta))/(2 * a);
				x2 = (-b + Math.sqrt(delta))/(2 * a);
				System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + "; x2 = " + x2);
			}
		}
		
		sc.close();
	}
	
}
