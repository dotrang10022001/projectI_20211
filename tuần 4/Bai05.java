package tuan4;
import java.util.Scanner;
public class Bai05 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao xau ky tu(chi chua 0,1): ");
		s=sc.nextLine();
		sc.close();
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		if(c[i]=='0')c[i]='1';
		else c[i]='0';
		System.out.print("Xau sau khi thay doi: ");
		for(int i=0;i<c.length;i++) System.out.print(c[i]);
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
