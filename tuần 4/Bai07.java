package tuan4;
import java.util.Scanner;
public class Bai07 {
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao xau S: ");
		S=sc.nextLine();
		sc.close();
		char c[] = S.toCharArray();
		for(int i=0;i<c.length;i++) if(Character.isDigit(c[i])) c[i]='$';
		System.out.print("Xau sau khi bien doi: ");
		for(int i=0;i<c.length;i++) System.out.print(c[i]);
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
