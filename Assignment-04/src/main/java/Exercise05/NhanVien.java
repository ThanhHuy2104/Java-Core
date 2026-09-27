package Exercise05;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, GioiTinh gioiTinh, int age, String address, String congViec) {
        super(hoTen, gioiTinh, age, address);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", address='" + address + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", age=" + age +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
