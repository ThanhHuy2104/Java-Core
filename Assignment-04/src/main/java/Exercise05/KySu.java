package Exercise05;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, GioiTinh gioiTinh, int age, String address, String nganhDaoTao) {
        super(hoTen, gioiTinh, age, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", age=" + age +
                ", hoTen='" + hoTen + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
