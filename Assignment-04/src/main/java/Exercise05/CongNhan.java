package Exercise05;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, GioiTinh gioiTinh, int age, String address, int bac) {
        super(hoTen, gioiTinh, age, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", address='" + address + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", age=" + age +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
