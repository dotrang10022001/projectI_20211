package tuan5;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
public class Bai4_tuan23 extends Scene{
	public Bai4_tuan23() {
		super(new Layout(),400,200);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 04: In ra màn hình các số <100 và chia hết cho 3,7");
			TextArea result= new TextArea();
			result.setEditable(false);
			for(int i=0;i<100;i++) {
				if(i%3==0&&i%7==0) result.appendText(Integer.toString(i)+" ");
			}
			setSpacing(20);
			getChildren().addAll(problem,result);
		}
	}
}
