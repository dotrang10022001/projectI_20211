package tuan3;
import java.util.Scanner;
public class Bai13 {
	static int m=1,n,A[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap kich thuoc o vuong n: ");
		do {
			n=sc.nextInt();
			if(n>8||n<3)System.out.print("Nhap lai: ");
		}while(n>8||n<3);
		sc.close();
		A = new int[n][n];
		int i=0;
		while(i<=n/2) method(i++);
		for(i=0;i<n;i++) {
			for(int j=0;j<n;j++) System.out.printf("%-4d",A[i][j]);
			System.out.println();
		}
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
	public static void method(int i) {
		for(int j=i;j<n-i;j++) A[i][j]=m++;
		for(int j=i+1;j<n-i;j++) A[j][n-i-1]=m++;
		for(int j=n-2-i;j>=i;j--) A[n-1-i][j]=m++;
		for(int j=n-2-i;j>i;j--) A[j][i]=m++;
	}
}
