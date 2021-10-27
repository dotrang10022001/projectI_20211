package tuan4;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		int n,max;
		System.out.print("Nhap kich thuoc mang xau: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String S[] = new String[n];
		System.out.println("Nhap vao "+n+" xau: ");
		sc.nextLine();
		for(int i=0;i<n;i++) S[i]=sc.nextLine();
	    sc.close();
	    System.out.println("Xau co do dai lon nhat la: ");
	    max=S[0].length();
	    for(int i=0;i<n;i++)
	    if(S[i].length()>max) max=S[i].length();
	    for(int i=0;i<n;i++)
	    if(S[i].length()==max)System.out.println(S[i]);
	    System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
