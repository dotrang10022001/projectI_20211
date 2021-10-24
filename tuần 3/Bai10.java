package tuan3;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		int n,length=1,j=0;
		System.out.print("Nhap so phan tu cua day: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int A[] = new int[n],B[] = new int[2*n];
		System.out.println("Nhap vao cac phan tu(so nguyen) cua day:");
		for(int i=0;i<n;i++) A[i] = sc.nextInt();
		sc.close();
		B[j]=0;
		for(int i=1;i<n;i++) 
		if(A[i]==A[i-1]) length++;
		else {B[j+n]=length;B[++j]=i;length=1;}
		B[j+n]=length;
		System.out.println("Day con lien nhau dai nhat "
				+ "\nbao gom cac so bang nhau "
				+ "\nco chi so bat dau va so luong phan tu la: ");
		int max=B[n];
		for(int i=n+1;i<2*n;i++) if(B[i]>max)max=B[i];
		for(int i=n;i<2*n;i++)
		if(B[i]==max) System.out.println(B[i-n]+" "+max);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
