package Exercise05;

public class Program {
    public static void main(String[] args) {
        CongNhan congNhan = new CongNhan("Linh", GioiTinh.nam, 20, "An Giang", 10);
        KySu kySu = new KySu("Nhan", GioiTinh.nam, 20, "An Giang", "IOT");
        NhanVien nhanVien = new NhanVien("Thu", GioiTinh.nu, 19, "WonderLand", "Chill");

        System.out.println("congNhan = " + congNhan.toString());
        System.out.println("kySu = " + kySu.toString());
        System.out.println("nhanVien = " + nhanVien.toString());

        QLCB Qlcb = new QLCB();
        Qlcb.themCanBo();
        Qlcb.timKiemCB();
        Qlcb.hienThiDS();
        Qlcb.xoaCB();

    }
}
