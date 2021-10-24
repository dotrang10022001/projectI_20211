package tuan2;

public class Bai07 {
	public static void main(String[] args) {
		int mod0 = 0,mod1 = 0,mod2 = 0,mod3 = 0;
		for(int i=0;i<=100;i++) {
			if(i%5==0)mod0++;
			if(i%5==1)mod1++;
			if(i%5==2)mod2++;
			if(i%5==3)mod3++;
		}
		System.out.println("So so tu nhien <=100 chia het cho 5 la: " + mod0);
		System.out.println("So so tu nhien <=100 chia cho 5 du 1 la: " + mod1);
		System.out.println("So so tu nhien <=100 chia cho 5 du 2 la: " + mod2);
		System.out.println("So so tu nhien <=100 chia cho 5 du 3 la: " + mod3);
		System.out.println("20194188 Do Thi Thuy Trang-709155");
	}
}
