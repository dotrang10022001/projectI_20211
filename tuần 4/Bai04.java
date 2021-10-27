package tuan4;
import java.util.Scanner;
public class Bai04 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ho ten: ");
		s=sc.nextLine();
		sc.close();
		s=s.trim();
		int i=0;
		while(s.charAt(i)!=' ')i++;
		System.out.print("Ho:"+s.substring(0,i));
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
