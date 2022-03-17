package sinhVien;

public class SinhVien {
    private int MSV;
    private String hoTen;
    private float LT, TH;
    private float TB;

    public SinhVien(){

    }
    public SinhVien(int MSV, String hoTen, float LT, float TH){
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.LT = LT;
        this.TH = TH;
    }
    public int getMSV(){
        return(MSV);
    }
    public String gethoTen(){
        return(hoTen);
    }
    public float getLT(){
        return(LT);
    }
    public float getTH(){
        return(TH);
    }
    public void setSinhVien(int MSV, String hoTen, float LT, float TH){
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.LT = LT;
        this.TH = TH;
    }
    public float tinhTrungBinh(){
        TB = (LT+TH)/2;
        return(TB);
    }
    public String toString(){
        return MSV+" - "+hoTen+" - "+LT+" - "+TH;
    }
}
