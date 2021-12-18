package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KQTimKiemController {
    
    @FXML
    private Label labelTen;

    @FXML
    private TextField soCanCuoc;

    @FXML
    private TextField gioiTinh;

    @FXML
    private TextField ngaySinh;

	@FXML
    private TextField queQuan;

    @FXML
    private TextField lop;
    
    @FXML
    private TextField tuoi;

    @FXML
    private TextField GVCN;
    public void ketQua(String soCC,String ht,String gt,String ns,String qq,String l,String gvcn,String t) {
    	labelTen.setText(ht);
    	soCanCuoc.setText(soCC);
    	gioiTinh.setText(gt);
    	ngaySinh.setText(ns);
    	queQuan.setText(qq);
    	lop.setText(l);
        GVCN.setText(gvcn);
        tuoi.setText(t);
    }
}
