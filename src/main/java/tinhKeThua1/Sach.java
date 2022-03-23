package tinhKeThua1;

public class Sach extends taiLieu{
    private String tenTacGia;
    private int soTrang;
    private double gia;

    public Sach(int ID, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang, double gia) {
        super(ID, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.gia = gia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String toString1() {
        return getClass().getSimpleName()+"." +toString()+
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", gia=" + gia +
                '}';
    }
}
