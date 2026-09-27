package Exercise05;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class QLCB {
    Scanner scanner = new Scanner(System.in);
    private List<CanBo> CanBoList = new ArrayList<>();

    void themCanBo() {
        System.out.println("Thêm cán bộ:");
        System.out.println("1. Công Nhân");
        System.out.println("2. Kỹ Sư");
        System.out.println("3. Nhân Viên");
        int menu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Họ Tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập Tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Giới Tính (1: nam, 2: nữ, 3: khác):");
        int choiceGender = Integer.parseInt(scanner.nextLine());
        GioiTinh gioiTinh = GioiTinh.khac;
        switch(choiceGender) {
            case 1:
                gioiTinh = GioiTinh.nam;
                break;
            case 2:
                gioiTinh = GioiTinh.nu;
                break;
            case 3:
                gioiTinh = GioiTinh.khac;
                break;
            default:
                System.out.println("Lỗi");
        }
        System.out.println("Nhập Địa Chỉ:");
        String diaChi = scanner.nextLine();

        switch(menu) {
            case 1:
                System.out.println("Nhập Cấp Bậc:");
                int bac = Integer.parseInt(scanner.nextLine());
                CongNhan congNhan = new CongNhan(hoTen, gioiTinh, age, diaChi, bac);
                CanBoList.add(congNhan);
                break;
            case 2:
                System.out.println("Nhập Ngành Đào Tạo:");
                String nganhDaoTao = scanner.nextLine();
                KySu kySu = new KySu(hoTen, gioiTinh, age, diaChi, nganhDaoTao);
                CanBoList.add(kySu);
                break;
            case 3:
                System.out.println("Nhập Công Việc:");
                String congViec = scanner.nextLine();
                NhanVien nhanVien = new NhanVien(hoTen, gioiTinh, age, diaChi, congViec);
                CanBoList.add(nhanVien);
                break;
        }


    }

    void timKiemCB() {
        System.out.println("Nhập Họ Tên:");
        String hoTen = scanner.nextLine();
        for(CanBo cb : CanBoList) {
            if(cb.hoTen.equals(hoTen)) {
                System.out.println("cb.toString() = " + cb.toString());
            }
        }
    }

    void hienThiDS() {
        for(CanBo cb: CanBoList) {
            System.out.println("cb.toString() = " + cb.toString());
        }
    }

    void xoaCB() {
        System.out.println("Nhập Tên:");
        String Ten = scanner.nextLine();
        CanBoList.removeIf(new Predicate<CanBo>() {
            @Override
            public boolean test(CanBo canBo) {
                int lastWhiteSpaceIndex = canBo.hoTen.lastIndexOf(' ');
                String tenCB = canBo.hoTen.substring(lastWhiteSpaceIndex + 1);
                return tenCB.equals(Ten);
            }
        });
    }
}
