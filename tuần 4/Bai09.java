package tuan4;
import java.util.Scanner;
public class Bai09 {
	public static void main(String[] args) {
		String S;int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao xau S: ");
		S=sc.nextLine();
		System.out.printf("Nhap vao i,j thuoc [0,%d): ",S.length());
		i=sc.nextInt();
		j=sc.nextInt();
		sc.close();
		char c[]=S.toCharArray(),temp;
		temp=c[i];c[i]=c[j];c[j]=temp;
		System.out.print("Xau S sau khi doi vi tri: ");
		for(int k=0;k<c.length;k++) System.out.print(c[k]);
		System.out.println("\n20194188 Do Thi Thuy Trang-709155");
	}
}
