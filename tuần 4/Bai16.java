package tuan4;
import java.util.Scanner;
public class Bai16 {
	public static void main(String[] args) {
		String S1,S2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao xau S1: ");
		S1=sc.nextLine();
		System.out.println("Nhap vao xau S2: ");
		S2=sc.nextLine();
		sc.close();
		char c1[]=S1.toCharArray(),c2[]=S2.toCharArray();
		int i=0,j=0;
		if(S1.length()>S2.length()) 
		System.out.println("Xau S1 khong phai xau con cua xau S2");
		else {
			while(i<c1.length&&j<c2.length) {
				if(c1[i]==c2[j]) {i++;j++;}
				else j++;
			}
			if(i==c1.length)
				System.out.println("Xau S1 la xau con cua xau S2");
			else 
				System.out.println("Xau S1 khong phai xau con cua xau S2");
		}
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
