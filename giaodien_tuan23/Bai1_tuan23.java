package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai1_tuan23 extends Scene{
	public Bai1_tuan23() {
		super(new Layout(),400,200);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 01: In ra màn hình tất cả các hợp số <100");
			TextArea result= new TextArea();
			result.setEditable(false);
			int count=0;
			for(int i=2; i<100; i++)
			if(!isPrime(i)) {
				result.appendText(Integer.toString(i)+"  ");
				count++;
				if(count==10) {result.appendText("\n");count = 0;}
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i = 2;i<n;i++) if(n%i==0) return false;
    	return true;
    }
}
