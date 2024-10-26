import java.util.Scanner;

public class ViDu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Khai báo biến 
		int a, b;
		
		// Nhập dữ liệu
		System.out.println("Nhập vào a: ");
		a = sc.nextInt();
		System.out.println("Nhập vào b: ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		int nhan = a * b;
		System.out.println(a + " * " + b + " = " + nhan);
		
		float thuong = (float)a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		
		int soDu = a % b;
		System.out.println(a + " % " + b + " = " + soDu);
		
		sc.close();
	}
	
}
