package Exercise05;

public class CanBo {
    protected String hoTen;
    protected int age;
    protected GioiTinh gioiTinh;
    protected String address;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CanBo(String hoTen, GioiTinh gioiTinh, int age, String address) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "{" +
                "hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ", gioiTinh=" + gioiTinh +
                ", address='" + address + '\'' +
                '}';
    }
}
