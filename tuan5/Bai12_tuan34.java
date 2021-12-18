package tuan5;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Bai12_tuan34 extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label problem = new Label("Bài 12: Dãy số a[ ] được gọi là dãy con của b[ ] "
				+ "nếu từ b [ ] xóa đi 1 vài số sẽ thu được a[ ]. "
				+ "\nCho trước 2 dãy số nguyên a[ ]; b[ ]. "
				+ "\nHãy kiểm tra xem a[ ] có là dãy con của b[ ] hay không?.");
		Label label1= new Label("Nhập số phần tử mảng a: ");
		TextField text1= new TextField();text1.setMaxWidth(50);
		Label label2= new Label("Nhập số phần tử mảng b: ");
		TextField text2=new TextField();text2.setMaxWidth(50);
		Label label3= new Label("Nhập các phần tử mảng a: ");
		TextField text3=new TextField();text3.setMaxWidth(200);
	    Label label4= new Label("Nhập các phần tử mảng b: ");
		TextField text4=new TextField();text4.setMaxWidth(200);
	    Button button=new Button("Kiểm tra");
	    button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				int m=Integer.parseInt(text1.getText());
				int n=Integer.parseInt(text2.getText());
				String str1=text3.getText();String[] s1=str1.split(" ");int a[]=new int[m];
				for(int i=0;i<m;i++) a[i]=Integer.parseInt(s1[i]);
				String str2=text4.getText();String[] s2=str2.split(" ");int b[]=new int[n];
				for(int i=0;i<n;i++) b[i]=Integer.parseInt(s2[i]);
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setHeaderText("Kết quả kiểm tra");
				String str="Day a[] khong phai la day con cua day b[]";
			    int i,j;
				if(m<=n) {
					i=0;j=0;
					sort(a);sort(b);
					while(i<m&&j<n) 		
					if(a[i]==b[j]) {i++;j++;}
					else {
						if(a[i]>b[j]) j++;
						else break;
					}
					if(i==m)str="Day a[] la day con cua day b[]";
				}
				alert.setContentText(str);
				alert.show();
			}
		});
	    VBox layout=new VBox();layout.setSpacing(20);
		layout.getChildren().addAll(problem,label1,text1,label2,text2,label3,text3,
				label4,text4,button);
		Scene scene = new Scene(layout,500,550);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Đỗ Thị Thùy Trang 20194188 709155");
		primaryStage.show();}
	public static void sort(int A[]) {
		for(int i=0;i<A.length-1;i++) 
		for(int j=i+1;j<A.length;j++)
		if(A[j]<A[i]) { int t=A[i]; A[i]=A[j]; A[j]=t;}
	}}
