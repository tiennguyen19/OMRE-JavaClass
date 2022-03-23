package tinhKeThua1;

public class bao extends taiLieu{
    private int ngayPhatHanh;

    public bao(int ID, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(ID, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void convertDate(double ngayPhatHanh){

    }

    public String toString3() {
        return getClass().getSimpleName()+"." +toString()+
                ", ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
