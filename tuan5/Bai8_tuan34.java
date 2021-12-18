package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai8_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 08: Cho một dãy số nguyên bất kỳ, "
				+ "\nhãy xóa đi trong dãy này các số hạng =0 và in ra màn hình các số còn lại.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số nguyên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Dãy sau khi xóa các phần tử bằng 0 là: ");
		TextField text3=new TextField();text3.setEditable(false);text3.setMaxWidth(200);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text3.setText("");String str=text2.getText();String[] s=str.split(" ");int A[]=new int[N];
				for(int i=0;i<N;i++) A[i]=Integer.parseInt(s[i]);
				for(int i=0;i<N;i++)
				if(A[i]==0) {xoa(A,i);i--;N--;}
				for(int i=0;i<N;i++) text3.appendText(Integer.toString(A[i])+" ");}});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3);
		Scene scene = new Scene(layout,500,450);primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");primaryStage.show();}
	public static void xoa(int a[],int vitrixoa) {for(int i=vitrixoa;i<a.length-1;i++) a[i]=a[i+1];}}
