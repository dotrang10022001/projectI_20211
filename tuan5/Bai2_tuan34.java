package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai2_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 02: Cho dãy số tự nhiên,in ra màn hình tất cả các số nguyên tố của dãy này.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số tự nhiên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Các số nguyên tố có trong dãy là: ");
		TextField text3=new TextField();text3.setEditable(false);text3.setMaxWidth(200);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {N=Integer.parseInt(text1.getText());}});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				text3.setText("");String str=text2.getText();String[] s=str.split(" ");
				int A[]=new int[N];
				for(int k=0;k<N;k++) A[k]=Integer.parseInt(s[k]);
			    for(int k=0;k<N;k++)if(isPrime(A[k])) text3.appendText(Integer.toString(A[k])+" ");}});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3);
		Scene scene = new Scene(layout,500,450);primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");primaryStage.show();}
	public static boolean isPrime(int n) {
    	if(n<2)return false;for(int i=2;i<n;i++) if(n%i==0)return false;
    	return true;}}
