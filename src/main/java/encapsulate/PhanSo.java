package encapsulate;

public class PhanSo {
    int tuso;
    private int mauso;

    public PhanSo(){

    }
    public PhanSo(int t, int m){
        this.tuso = t;
        this.mauso = m;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public int ucln(int a, int b) {
        if (a == 0 || b == 0) return 1;
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b)
            if (a > b)
                a -= b;
            else
                b -= a;
        return a;
    }
    public PhanSo rutgon() {
        int u = ucln(this.tuso, this.mauso);
        return new PhanSo(this.tuso / u, this.mauso / u);
    }

    public void hienthi(){
        System.out.printf("%d/%d\t",this.tuso, this.mauso);
    }

    public PhanSo cong(PhanSo p){
        int t= (this.tuso*p.mauso) + (this.mauso*p.tuso);
        int m = this.mauso*p.mauso;

        PhanSo tong= new PhanSo(t,m);
        return tong.rutgon();
    }

    public PhanSo tru(PhanSo p){
        int t= (this.tuso*p.mauso) - (this.mauso*p.tuso);
        int m = this.mauso*p.mauso;

        PhanSo tong= new PhanSo(t,m);
        return tong.rutgon();
    }
    public PhanSo nhan(PhanSo p){
        int t= this.tuso*p.tuso;
        int m = this.mauso*p.mauso;

        PhanSo tong= new PhanSo(t,m);
        return tong.rutgon();
    }
    public PhanSo chia(PhanSo p){
        int t= this.tuso*p.mauso;
        int m = this.mauso*p.tuso;

        PhanSo tong= new PhanSo(t,m);
        return tong.rutgon();
    }

}
