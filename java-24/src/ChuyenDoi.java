import java.util.Scanner;

public class ChuyenDoi {

	public static void main(String[] args) {
		/*
		 * Chia liên tục cho 2 và lấy phần dư
		 * Đảo ngược
		 * 10:2 = 5 dư 0
		 * 5:2 = 2 dư 1
		 * 2:2 = 1 dư 0
		 * 1:2 = 0 dư 1
		 * 0
		 * 10
		 * 010
		 * 1010
		 */
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n > 0:");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while(n > 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		System.out.println("Số hệ nhị phân là: " + nhiPhan);
		
		sc.close();
	}
	
}
