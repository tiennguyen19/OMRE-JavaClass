package homeWorkInterface;

public class HinhBinhHanh implements HinhHoc2D {
    protected double canhDay;
    protected double canhBe;
    protected double chieuCao;

    public HinhBinhHanh(double canhDay, double canhBe, double chieuCao) {
        this.canhDay = canhDay;
        this.canhBe = canhBe;
        this.chieuCao = chieuCao;
    }

    public HinhBinhHanh(double canhDay, double chieuCao) {
        this.canhDay = canhDay;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhChuVi() {
        return 2*(canhDay+canhBe);
    }

    @Override
    public double tinhDienTich() {
        return chieuCao*canhDay;
    }

    @Override
    public String toString() {
        return "HinhBinhHanh[" +
                "canhDay=" + canhDay +
                ", canhBe=" + canhBe +
                ", chieuCao=" + chieuCao +
                ", Chuvi=" +tinhChuVi()+
                ", DienTich = "+tinhDienTich()+
                    ']';
        }
    }

