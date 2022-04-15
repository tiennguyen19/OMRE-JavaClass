package Lesson10_1;

public class HinhVuong implements IHinhHoc{
    private int canh;

    @Override
    public double tinhChuVi() {
        return 4*canh;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong [" +
                "canh = " + canh +
                " ChuVi = " +tinhChuVi()+
                " DienTich = " +tinhDienTich()+
                " ]";
    }
}
