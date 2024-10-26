import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a:");
		int a = sc.nextInt();
		
		String ketQua = (a%2 == 0)?"số chẵn":"số lẻ";
		System.out.println(a + " là "+ ketQua);
		
		sc.close();
	}
}
