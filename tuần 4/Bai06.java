package tuan4;
import java.util.Scanner;
public class Bai06 {
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao xau S: ");
		S=sc.nextLine();
		sc.close();
		System.out.print("Xau nguoc cua xau S la: ");
		char c[] = S.toCharArray();
		for(int i=0;i<c.length/2;i++) {char t=c[i];c[i]=c[c.length-1-i];c[c.length-1-i]=t;}
		for(int i=0;i<c.length;i++) System.out.print(c[i]);
	    System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
