package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai9_tuan34 extends Application{
	int N,c;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 09: Cho một dãy số nguyên bất kỳ, cho trước 1 số c. "
				+ "\nHãy đếm có bao nhiêu số của dãy trên =c; >c; <c.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();
		text1.setMaxWidth(50);
		Label label2= new Label("Nhập số c: ");
		TextField text2=new TextField();
	    text2.setMaxWidth(50);
		Label label3= new Label("Nhập vào N số nguyên: ");
		TextField text3=new TextField();
	    text3.setMaxWidth(200);
	    Label label4=new Label("Số các số trong dãy bằng c là: ");
	    TextField text4=new TextField();
	    text4.setEditable(false);
	    text4.setMaxWidth(50);
	    Label label5=new Label("Số các số trong dãy nhỏ hơn c là: ");
	    TextField text5=new TextField();
	    text5.setEditable(false);
	    text5.setMaxWidth(50);
	    Label label6=new Label("Số các số trong dãy lớn hơn c là: ");
	    TextField text6=new TextField();
	    text6.setEditable(false);
	    text6.setMaxWidth(50);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}
		});
	    text2.setOnAction(new EventHandler<ActionEvent>() {
	    	public void handle(ActionEvent event) {c=Integer.parseInt(text2.getText());}
	    });
		text3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String str=text3.getText();
				String[] s=str.split(" ");
				int A[]=new int[N];
				for(int i=0;i<N;i++) A[i]=Integer.parseInt(s[i]);
				int number1=0,number2=0,number3=0;
				for(int i=0;i<N;i++) {
					if(A[i]==c)number1++;
					else if(A[i]<c)number2++;else number3++;
				}
				text4.setText(Integer.toString(number1));
				text5.setText(Integer.toString(number2));
				text6.setText(Integer.toString(number3));
			}
		});
	    VBox layout=new VBox();layout.setSpacing(10);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,label4,text4,
				label5,text5,label6,text6);
		Scene scene = new Scene(layout,400,450);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");primaryStage.show();}}
