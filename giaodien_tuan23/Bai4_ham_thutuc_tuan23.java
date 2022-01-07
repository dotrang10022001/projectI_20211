package tuan5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
public class Bai4_ham_thutuc_tuan23 extends Scene{
	public Bai4_ham_thutuc_tuan23() {
		super(new Layout(),400,250);
	}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2)."
					+ " \nTính số Fibonaxi thứ N.");
			Label label1= new Label("Nhập N: ");
			TextField text= new TextField();text.setMaxWidth(50);
			Label label2= new Label("Số fibonaxi thứ N là:");
			TextField result=new TextField();
			result.setEditable(false);result.setMaxWidth(100);
			text.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					int N=Integer.parseInt(text.getText());
					result.setText(Integer.toString(fibonaxi(N)));}
			});
		    setSpacing(20);
			getChildren().addAll(problem,label1,text,label2,result);
		}
	}
	
	public static int fibonaxi(int n) {
    	if(n==1||n==2)return 1;return fibonaxi(n-1)+fibonaxi(n-2);
    }
}
