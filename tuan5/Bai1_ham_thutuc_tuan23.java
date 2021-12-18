package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai1_ham_thutuc_tuan23 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 01: Cho số tự nhiên N bất kỳ.\n"
				+ "Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
		Label label1= new Label("Nhập N: ");
		TextField text= new TextField();text.setMaxWidth(50);
		Label label2= new Label("Tổng S:");
		TextField result=new TextField();result.setEditable(false);result.setMaxWidth(100);
		text.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				int N=Integer.parseInt(text.getText());Float S=0f;
				for(int i=1;i<=N;i++) S+=1.0f/tinhTong(i);
				result.setText(Float.toString(S));}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		Scene scene = new Scene(layout,400,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}
	public static long tinhTong(int n) {
    	long tong=0;
    	for(int i=1;i<=n;i++) tong+=i;
    	return tong;}}
