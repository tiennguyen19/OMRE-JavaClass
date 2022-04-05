package bai9;

public class TinhToan extends PhanSo implements IPhanSo {

    @Override
    public PhanSo cong(PhanSo ps1, PhanSo ps2) {
        PhanSo ps = new PhanSo();
        ps.setTuSo(this.getTuSo() * ps1.getMauSo() * ps2.getMauSo() + ps1.getTuSo() * this.getMauSo() * ps2.getMauSo() + ps2.getTuSo() * this.getMauSo() * ps1.getMauSo());
        ps.setMauSo(this.getMauSo() * ps1.getMauSo() * ps2.getMauSo());
        return ps;
    }

    @Override
    public PhanSo tru(PhanSo ps1, PhanSo ps2) {
        PhanSo ps = new PhanSo();
        ps.setTuSo(this.getTuSo() * ps1.getMauSo() * ps2.getMauSo() - ps1.getTuSo() * this.getMauSo() * ps2.getMauSo() - ps2.getTuSo() * this.getMauSo() * ps1.getMauSo());
        ps.setMauSo(this.getMauSo() * ps1.getMauSo() * ps2.getMauSo());
        return ps;
    }

    @Override
    public PhanSo nhan(PhanSo ps1) {
        PhanSo ps = new PhanSo();
        ps.setTuSo(this.getTuSo() * ps1.getTuSo());
        ps.setMauSo(this.getMauSo() * ps1.getMauSo());
        return ps;
    }

    @Override
    public PhanSo chia(PhanSo ps1) {
        PhanSo ps = new PhanSo();
        ps.setTuSo(this.getTuSo() * ps1.getMauSo());
        ps.setMauSo(this.getMauSo() * ps1.getTuSo());
        return ps;
    }

    public TinhToan() {

        }

    public TinhToan(long tuSo, long mauSo) {
        super(tuSo, mauSo);
    }
}
