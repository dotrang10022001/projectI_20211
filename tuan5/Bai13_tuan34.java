package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai13_tuan34 extends Application{
	static int A[][],n,m;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		Label problem = new Label("Nhập vào kích thước ô vuông n*n, kiểm tra 3<=n<= 8. "
				+ "\nHiển thị ra màn hình kết quả như màn hình");
		Label label1= new Label("Nhập kích thước ô vuông(3<=n<=8): ");
		TextField text= new TextField();
		text.setMaxWidth(50);
		Label label2= new Label("Kết quả: ");
		TextArea result=new TextArea();
		result.setEditable(false);
		result.setMaxWidth(200);
		text.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				m=1;
				result.setText("");
				n=Integer.parseInt(text.getText());
				if(n>8||n<3) {
					text.setText("");
					Alert alert=new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("Information");
					alert.setHeaderText("Lỗi khi nhập kích thước ô vuông n");
					alert.setContentText("Hãy nhập lại n sao cho 3<=n<=8 !!!");
					alert.show();
				}else {
					A = new int[n][n];
					int i=0;
					while(i<=n/2) method(i++);
					for(i=0;i<n;i++) {
						for(int j=0;j<n;j++) {
							if(A[i][j]<10)result.appendText("0");
							result.appendText(Integer.toString(A[i][j])+"  ");
						}
						result.appendText("\n");
					}
				}
				
			}
		});
	    VBox layout=new VBox();
		layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text,label2,result);
		scene = new Scene(layout,400,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();
	}
    public static void method(int i) {
	    for(int j=i;j<n-i;j++) A[i][j]=m++;
	    for(int j=i+1;j<n-i;j++) A[j][n-i-1]=m++;
	    for(int j=n-2-i;j>=i;j--) A[n-1-i][j]=m++;
	    for(int j=n-2-i;j>i;j--) A[j][i]=m++;
}
}
