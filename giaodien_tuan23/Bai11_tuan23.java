package tuan5;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
public class Bai11_tuan23 extends Scene{
	static int N, i, j;
	public Bai11_tuan23() {super(new Layout(),400,400);}
	public static class Layout extends VBox {
		public Layout() {
			Label problem = new Label("Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước.");
			Label label1= new Label("Nhập số tự nhiên N(>=1): ");
			TextField text1= new TextField();text1.setMaxWidth(50);
			Label label2= new Label("Nhập vào N số nguyên: ");
			TextField text2=new TextField();text2.setMaxWidth(200);
			Label label3= new Label("Dãy số trước khi tráo đổi ngẫu nhiên là: ");
			TextField text3=new TextField();text3.setEditable(false);text3.setMaxWidth(200);
		    Label label4=new Label("Dãy số sau khi tráo đổi ngẫu nhiên 2 vị trí là: ");
		    TextField text4=new TextField();text4.setEditable(false);text4.setMaxWidth(200);
		    text1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					N=Integer.parseInt(text1.getText());Random r=new Random();i=r.nextInt(N);j=r.nextInt(N);
				}
			});
			text2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					text4.setText("");String str=text2.getText();text3.setText(str);String[] s=str.split(" ");
					int A[]=new int[N];
					for(int k=0;k<N;k++) A[k]=Integer.parseInt(s[k]);int tmp=A[i];A[i]=A[j];A[j]=tmp;
				    for(int k=0;k<N;k++) text4.appendText(Integer.toString(A[k])+" ");
				}
			});
		    setSpacing(20);
			getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,label4,text4);
		}
	}
}
