import java.util.Scanner;

public class BaiTapChanLe {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n: ");
		n = sc.nextInt();
		
		// Kiểm tra tính chẵn lẻ
		if(n%2 == 0) {
			System.out.println(n + " là số chẵn");
		} else {
			System.out.println(n + " là số lẻ");
		}
		
		sc.close();
	}
	
}
