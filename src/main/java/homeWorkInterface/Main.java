package homeWorkInterface;

public class Main {
        public static void main(String[] args) {
            System.out.println("Bai 1:");
            Circle cl = new Circle(5);
            System.out.println(cl.toString());
            System.out.println("ChuVi = "+cl.getPerimeter());
            System.out.println("DienTich = "+cl.getArea());

            ResizableCircle rc = new ResizableCircle(5);
            System.out.println("\n"+rc.toString());
            System.out.println(rc.resize(25));

            System.out.println("\nBai 2:");

            HinhBinhHanh hbh = new HinhBinhHanh(3,4,5);
            System.out.println(hbh.toString());

            HinhChuNhat hcn = new HinhChuNhat(5.4,7);
            System.out.println(hcn.toString());

            HinhTron ht = new HinhTron(5.7);
            System.out.println(ht.toString());

            HinhTru htt = new HinhTru(6, 10.9);
            System.out.println(htt.toString());
        }
}

