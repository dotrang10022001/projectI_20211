package tuan4;
import java.util.Scanner;
public class Bai11 {
	public static void main(String[] args) {
		int n,number=0;
		System.out.print("Nhap vao so hoc sinh: ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		String ds[] = new String[n];
		System.out.println("Nhap vao ho ten "+n+" hoc sinh: ");
		for(int i=0;i<n;i++) ds[i]=sc.nextLine();
        sc.close();
        for(int i=0;i<n;i++) if(layTen(ds[i]).equals("An")) number++;
        System.out.println("So hoc sinh ten An la: "+number);
        System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
    public static String layTen(String s) {
    	s=s.trim();
    	int i=s.length()-1;
    	while(s.charAt(i)!=' ')i--;
        return s.substring(i+1);
    }
}
