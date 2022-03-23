package tinhKeThua1;

public class tapChi extends taiLieu{
    private int soPhatHanh;

    public tapChi(int ID, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh) {
        super(ID, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String toString2() {
        return getClass().getSimpleName()+"." +toString()+
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
