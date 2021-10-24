package tuan3;
import java.util.Scanner;
public class Bai09 {
	public static void main(String[] args) {
		int n,c,num1=0,num2=0,num3=0;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap vao cac phan tu(so nguyen) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		if(A[i]==c)num1++;
		else if(A[i]<c)num2++;
        else num3++;
		System.out.println("So cac so bang " +c+" trong day la: "+num1);
		System.out.println("So cac so nho hon "+c+" trong day la: "+num2);
		System.out.println("So cac so lon hon "+c+" trong day la: "+num3);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
