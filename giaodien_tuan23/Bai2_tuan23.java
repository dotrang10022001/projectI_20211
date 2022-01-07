package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai2_tuan23 extends Scene{
    static int number=0;
	
	public Bai2_tuan23() {
		super(new Layout(),400,200);
	}
	
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
			TextArea result= new TextArea();
			result.setEditable(false);
			int i = 2;
			while(number<20) {
				if(isPrime(i)) result.appendText(Integer.toString(i)+" ");
				i++;
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
		number++;
    	return true;
    }
}
