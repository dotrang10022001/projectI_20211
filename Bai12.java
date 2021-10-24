package tuan2;
import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) {
		int h;
		System.out.print("Nhap h: ");
		Scanner sc = new Scanner(System.in);
		do {
			h = sc.nextInt();
			if(h>10||h<2)System.out.print("Nhap lai: ");
		}while(h>10||h<2);
	    sc.close();
	    for(int i=1;i<=h;i++) {
	        for(int j=1;j<=i;j++) {
	    	    System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    System.out.println("20194188 Do Thi Thuy Trang-709155");
    }
}
