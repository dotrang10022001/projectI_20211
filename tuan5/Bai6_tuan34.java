package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai6_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 06: Cho một dãy số tự nhiêN\nhãy in ra tất cả các số hạng của dãy trên thỏa mãn:"
				+ "\nsố này là ước số thực sự của 1 số hạng khác trong dãy trên.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số tự nhiên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Các cặp số thỏa mãn số này là ước số thực sự của số kia trong dãy là: ");
		TextArea text3=new TextArea();text3.setEditable(false);text3.setMaxWidth(200);text3.setMaxHeight(300);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text3.setText("");String str=text2.getText();String[] s=str.split(" ");int A[]=new int[N];
				for(int k=0;k<N;k++) A[k]=Integer.parseInt(s[k]);
				for(int i=0;i<N-1;i++)
				for(int j=i+1;j<N;j++) if(A[i]%A[j]==0||A[j]%A[i]==0&&A[i]!=A[j])
					text3.appendText("("+Integer.toString(A[i])+","+Integer.toString(A[j])+")\n");}});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3);
		Scene scene = new Scene(layout,500,450);primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}}
