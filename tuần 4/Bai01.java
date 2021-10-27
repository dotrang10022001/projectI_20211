package tuan4;
import java.util.Scanner;
public class Bai01 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ho ten: ");
		s = sc.nextLine();
		sc.close();
		s=s.trim();
		while(s.indexOf("  ")!=-1) s=s.replaceAll("  ", " ");
		System.out.println("Ho ten sau khi xoa dau cach thua:\n" + s);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
