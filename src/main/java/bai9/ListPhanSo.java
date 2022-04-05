package bai9;

public class ListPhanSo {
    private static int id;
    private static PhanSo cong;
    private static PhanSo tru;
    private static PhanSo nhan;
    private static PhanSo chia;

    public ListPhanSo(int id, PhanSo cong, PhanSo tru, PhanSo nhan, PhanSo chia) {
        this.id = id;
        this.cong = cong;
        this.tru = tru;
        this.nhan = nhan;
        this.chia = chia;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static PhanSo getCong() {
        return cong;
    }

    public void setCong(PhanSo cong) {
        this.cong = cong;
    }

    public static PhanSo getTru() {
        return tru;
    }

    public void setTru(PhanSo tru) {
        this.tru = tru;
    }

    public static PhanSo getNhan() {
        return nhan;
    }

    public void setNhan(PhanSo nhan) {
        this.nhan = nhan;
    }

    public static PhanSo getChia() {
        return  chia;
    }

    public void setChia(PhanSo chia) {
        this.chia = chia;
    }
}

