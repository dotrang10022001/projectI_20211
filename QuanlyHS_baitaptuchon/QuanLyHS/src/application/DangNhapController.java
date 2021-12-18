package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DangNhapController {
    Stage stage;
    Scene scene;
    @FXML
    private TextField tenDangNhap;

    @FXML
    private PasswordField matKhau;

    @FXML
    private Button buttonDangNhap;

    @FXML
    void dangNhap(ActionEvent event) {
    	Alert alert;
    	if(tenDangNhap.getText().equals("admin")&&matKhau.getText().equals("admin")) {
    		try {
        		Parent root = FXMLLoader.load(getClass().getResource("TrangChu.fxml"));
        		scene = new Scene(root);
        		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        		stage.setTitle("Quản lý học sinh");
        		stage.setScene(scene);
        		stage.centerOnScreen();
        		stage.show();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	} else {
    		alert=new Alert(Alert.AlertType.INFORMATION);
    		alert.setHeaderText("Thông báo");
    		alert.setContentText("Thông tin đăng nhập sai!");
    		alert.show();
    	}
    }
}
