package homeWorkInterface;

public class HinhChuNhat extends HinhBinhHanh{
    public HinhChuNhat(double canhDay, double chieuCao) {
        super(canhDay, chieuCao);
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "canhDay=" + canhDay +
                ", chieuCao=" + chieuCao +
                ", Chuvi=" +tinhChuVi()+
                ", DienTich = "+tinhDienTich()+
                '}';
    }
}
