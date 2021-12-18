package application;

public class HocSinh {
	private String soCanCuoc;
	private String hoTen;
	private String gioiTinh;
	private String ngaySinh;
	private String queQuan;
	private String lop;
	private String tuoi;
	public HocSinh(String soCanCuoc, String hoTen,String gioiTinh,String ngaySinh,String queQuan,String lop,String tuoi) {
		this.soCanCuoc=soCanCuoc;
		this.hoTen=hoTen;
		this.gioiTinh=gioiTinh;
		this.ngaySinh=ngaySinh;
		this.queQuan=queQuan;
		this.lop=lop;
		this.tuoi=tuoi;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getSoCanCuoc() {
		return soCanCuoc;
	}
	public void setSoCanCuoc(String soCanCuoc) {
		this.soCanCuoc = soCanCuoc;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
}
