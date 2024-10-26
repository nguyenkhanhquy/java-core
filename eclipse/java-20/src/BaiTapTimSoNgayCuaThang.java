import java.util.Scanner;

public class BaiTapTimSoNgayCuaThang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thang, nam;
		System.out.println("Nhập vào tháng:");
		thang = sc.nextInt();
		System.out.println("Nhập vào năm:");
		nam = sc.nextInt();
		
		switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Có 31 ngày");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Có 30 ngày");
				break;
			case 2:
				if (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0))
				{
					System.out.println("Có 29 ngày");
				} else {
					System.out.println("Có 28 ngày");
				}
				break;
			default:
				System.out.println("Nhập dữ liệu sai!");
				break;
		}
		
		sc.close();
	}
	
}
