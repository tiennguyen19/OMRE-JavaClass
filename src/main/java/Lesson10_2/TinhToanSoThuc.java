package Lesson10_2;

public class TinhToanSoThuc implements ITinhToan {
    int n=0;
    double tong, hieu, tich, thuong;
    double[] sothuc = new double[n];
    int i=0;
    public TinhToanSoThuc() {
    }

    @Override
    public Object cong(Object[] args) {
        for ( ; i<n; i++){
            tong += sothuc[i];
        }
        return tong;
    }

    @Override
    public Object tru(Object[] args) {
        for ( ; i<n; i++){
            hieu -= sothuc[i];
        }
        return hieu;
    }

    @Override
    public Object nhan(Object[] args) {
        for ( ; i<n; i++){
            tich *= sothuc[i];
        }
        return tich;
    }

    @Override
    public Object chia(Object[] args) {
        for ( ; i<n; i++){
            thuong /= sothuc[i];
        }
        return thuong;
    }
}
