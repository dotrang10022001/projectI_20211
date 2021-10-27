package tuan4;
import java.util.Scanner;
public class Bai08 {
	public static void main(String[] args) {
		String S1,S2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao xau S1: ");
		S1=sc.nextLine();
		System.out.print("Nhap vao xau S2: ");
		S2=sc.nextLine();
		sc.close();
		int counter=0;
		for(int i=0;i<S2.length()-S1.length()+1;i++) 
		if(S2.substring(i, i+S1.length()).equals(S1)) counter++;
		System.out.println("So lan xau S1 xuat hien trong S2 la: "+counter);
	    System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
