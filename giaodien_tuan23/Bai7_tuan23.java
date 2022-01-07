package tuan5;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai7_tuan23 extends Scene{
	public Bai7_tuan23() {
		super(new Layout(),600,400);
	}
	public static class Layout extends VBox {
		public Layout() {
			TextArea problem = new TextArea("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem "
					+ "có bao nhiêu số\n"
		    		+ "a. Chia hết cho 5\n" + "b. Chia 5 dư 1\n" + "c. "
		    				+ "Chia 5 dư 2\n" + "d. Chia 5 dư 3");
		    problem.setEditable(false);
			TextArea result= new TextArea();
			result.setEditable(false);
			int mod0 = 0,mod1 = 0,mod2 = 0,mod3 = 0;
			for(int i=0;i<=100;i++) {
				if(i%5==0)mod0++;
				if(i%5==1)mod1++;
				if(i%5==2)mod2++;
				if(i%5==3)mod3++;}
			result.appendText("So so tu nhien <=100 chia het cho 5 la: " + Integer.toString(mod0)+"\n");
			result.appendText("So so tu nhien <=100 chia cho 5 du 1 la: " + Integer.toString(mod1)+"\n");
			result.appendText("So so tu nhien <=100 chia cho 5 du 2 la: " + Integer.toString(mod2)+"\n");
			result.appendText("So so tu nhien <=100 chia cho 5 du 3 la: " + Integer.toString(mod3)+"\n");
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
}
