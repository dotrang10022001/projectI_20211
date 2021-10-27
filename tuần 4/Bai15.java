package tuan4;
import java.util.Scanner;
public class Bai15 {
	public static void main(String[] args) {
		String S1,S2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap vao xau S1: ");
		S1=sc.nextLine();
		System.out.print("Nhap vao xau S2: ");
		S2=sc.nextLine();
		sc.close();
		StringBuffer s=new StringBuffer(S1.length()+S2.length());
		s.append(S2.substring(0, S2.length()/2));
		s.append(S1);
		s.append(S2.substring(S2.length()/2, S2.length()));
		System.out.println("Xau S2 sau khi chen S1 vao giua la: "+s);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
