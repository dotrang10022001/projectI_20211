package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai7_tuan34 extends Application{
	int N;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 07: Cho một dãy số tự nhiên, "
				+ "\nhãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số nào trong dãy trên.");
		Label label1= new Label("Nhập số tự nhiên N(>=1): ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập vào N số tự nhiên: ");
		TextField text2=new TextField();text2.setMaxWidth(200);
		Label label3= new Label("Số tự nhiên nhỏ nhất không bằng bất cứ số nào trong dãy là: ");
		TextField text3=new TextField();text3.setEditable(false);text3.setMaxWidth(50);
	    text1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				N=Integer.parseInt(text1.getText());
			}
		});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String str=text2.getText();
				String[] s=str.split(" ");
				int A[]=new int[N];
				int flag=0;
				for(int i=0;i<N;i++) A[i]=Integer.parseInt(s[i]);
				for(int i=0;i<N-1;i++)
				for(int j=i+1;j<N;j++) 
				if(A[j]<A[i]) {int tmp=A[i];A[i]=A[j];A[j]=tmp;}
				if(A[0]<A[1]) {text3.setText(Integer.toString(A[0]));flag=1;}
				else {
					for(int i=1;i<N-1;i++)
						if(A[i]>A[i-1]&&A[i]<A[i+1]) {
							text3.setText(Integer.toString(A[i]));
							flag=1;
							break;
						}
					}
			    if(flag==0) {
			    	if(A[N-1]>A[N-2])text3.setText(Integer.toString(A[N-1]));
			    	else {
			    		text3.setText("");
			    		Alert alert=new Alert(AlertType.INFORMATION);
			    		alert.setTitle("Information");
			    		alert.setContentText("Không có số nào thỏa mãn yêu cầu đề bài");
			    		alert.show();
			    	}
			    }
			}
		});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3);
		Scene scene = new Scene(layout,500,450);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}}
