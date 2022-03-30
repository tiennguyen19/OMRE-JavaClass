package homeWorkInterface;

public class HinhTron implements HinhHoc2D{
    protected double radius;

    public HinhTron(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return 2*radius*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": [" +
                "radius=" + radius +
                ", Chuvi=" +tinhChuVi()+
                ", DienTich = "+tinhDienTich()+
                ']';
    }
}
