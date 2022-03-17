package sinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien(841234,"Nguyen van B", 5F, 7.5f);

        System.out.println("Ma sinh vien: "+sv.getMSV());
        System.out.println("Ho ten: "+sv.gethoTen());
        System.out.println("Diem ly thuyet: "+sv.getLT());
        System.out.println("Diem thuc hanh: "+sv.getTH());
        System.out.println("Diem trung bình: "+sv.tinhTrungBinh());

        System.out.println("\n"+sv.toString());
    }
}
