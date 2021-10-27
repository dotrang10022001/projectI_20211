package tuan4;
import java.util.Scanner;
public class Bai02 {
	public static void main(String[] args) {
		String s;
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao xau ky tu bat ky:");
		s=sc.nextLine();
		sc.close();
        for(int i=0;i<s.length()-2;i++)
        if(s.substring(i, i+3).equals("abc")) counter++;
        System.out.println("So lan xuat hien xau con \"abc\" la: "+counter);
        System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
