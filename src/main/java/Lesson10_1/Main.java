package Lesson10_1;

public class Main {
    public static void main(String[] args) {

        HinhVuong hv = new HinhVuong(7);
        System.out.println(hv.toString());
        HinhTron ht = new HinhTron(6);
        System.out.println(ht.toString());

        Drawable<HinhVuong> dhv = new Drawable<>();
        dhv.draw(new HinhVuong(7));

        Drawable<HinhTron> dht = new Drawable<>();
        dht.draw(new HinhTron(5));

    }
}
