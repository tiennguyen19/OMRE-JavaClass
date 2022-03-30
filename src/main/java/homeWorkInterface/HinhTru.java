package homeWorkInterface;

public class HinhTru extends HinhTron implements HinhHoc3D {
    protected double chieuCao;

    public HinhTru(double radius, double chieuCao) {
        super(radius);
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhTheTich() {
        return chieuCao*tinhDienTich();
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "radius=" + radius +
                ", chieuCao=" + chieuCao +
                ", TheTich=" +tinhTheTich()+
                '}';
    }
}
