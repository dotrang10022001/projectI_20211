package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai9_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 09: Cho số tự nhiên N>1 bất kỳ (đã gán trước đó). "
				+ "In ra khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn VD: 9🡪3.3; 12🡪2.2.3.");
		Label label1= new Label("Nhập N: ");
		TextField text= new TextField();
		text.setMaxWidth(50);
		Label label2= new Label("Khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn của N là: ");
		TextField result=new TextField();
		result.setEditable(false);
		result.setMaxWidth(100);
		text.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				result.setText("");
				int N=Integer.parseInt(text.getText());
				for(int i=2;i<=N;i++)
				if(N%i==0) {N = N/i;result.appendText(Integer.toString(i));if(N!=1) result.appendText("x");i--;}
			}});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		Scene scene = new Scene(layout,600,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}}
