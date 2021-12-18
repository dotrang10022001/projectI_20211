package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai4_tuan34 extends Application{
	int N;
	public static void main(String[] args){launch(args);}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 04: Cho một dãy các số tự nhiên, "
				+ "\ntìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số tự nhiên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Giá trị max của dãy là:  ");
		TextField text3=new TextField();text3.setEditable(false);text3.setMaxWidth(200);
	    Label label4=new Label("Các chỉ số ứng với giá trị max của dãy là: ");
	    TextField text4=new TextField();text4.setEditable(false);text4.setMaxWidth(200);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text4.setText("");String str=text2.getText();text3.setText(str);
				String[] s=str.split(" ");int A[]=new int[N];
				for(int k=0;k<N;k++) A[k]=Integer.parseInt(s[k]);int max=A[0];
				for(int k=1;k<N;k++) if(A[k]>max) max=A[k];
				text3.setText(Integer.toString(max));
			    for(int k=0;k<N;k++) if(A[k]==max) text4.appendText(Integer.toString(k)+" ");}});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,label4,text4);
		Scene scene = new Scene(layout,500,450);primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");primaryStage.show();}}
