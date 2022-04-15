package Lesson10_1;

public class HinhTron implements IHinhHoc{
    private int radius;

    @Override
    public double tinhChuVi() {
        return 2*radius*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return radius*radius*Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public HinhTron(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "HinhTron [" +
                "radius = " + radius +
                " ChuVi = " +tinhChuVi()+
                " DienTich = " +tinhDienTich()+
                " ]";
    }
}
