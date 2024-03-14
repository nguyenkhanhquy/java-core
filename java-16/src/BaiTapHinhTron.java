import java.util.Scanner;

public class BaiTapHinhTron {

	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính r: ");
		r = sc.nextDouble();
		
		// Tính chu vi
		chuVi = 2 * Math.PI * r;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));
		System.out.println("Chu vi = " + Math.round(chuVi * 100.0) / 100.0);
		
		// Tính diện tích
		dienTich = Math.PI * Math.pow(r,2);
		System.out.println("Diện tích = " + dienTich);
		System.out.println("Diện tích = " + Math.round(dienTich));
		System.out.println("Diện tích = " + Math.round(dienTich * 100.0) / 100.0);
		
		sc.close();
	}
	
}
