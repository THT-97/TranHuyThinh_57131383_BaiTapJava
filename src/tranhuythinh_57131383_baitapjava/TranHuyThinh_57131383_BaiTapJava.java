/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranhuythinh_57131383_baitapjava;

import BaiTap1.NhanVien;
import BaiTap2.QuanLyNhanVien;
import BaiTap3.SinhVienBiz;
import BaiTap3.SinhVienIT;
import BaiTap3.SinhVienPoly;
import BaiTap4.QuanLyChuyenXe;
import BaiTap4.XeNgoaiThanh;
import BaiTap4.XeNoiThanh;

/**
 *
 * @author TranHuyThinh
 */
public class TranHuyThinh_57131383_BaiTapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bai 1
        NhanVien nv1 = new NhanVien("Luong Van An", 35, "dia chi 1", 11.5, 250);
        NhanVien nv2 = new NhanVien("Nguyen Van Ba", 25, "dia chi 2", 5.5, 99);
        System.out.println("BAI 1:");
        System.out.println("Ten\t\tTuoi\tLuong\tGio Lam\t\tDia Chi\t\tThuong\n");
        System.out.println(nv1.getThongTin() +"\t" + nv1.tinhThuong());
        System.out.println(nv2.getThongTin() +"\t" + nv2.tinhThuong());
        
        //Bai 2
        NhanVien nv3 = new NhanVien("Le Thi Lan", 30, "dia chi 3", 9.5, 200);
        NhanVien nv4 = new NhanVien("Ngo Ngoc Hoa", 27, "dia chi 4", 7.25, 120);
        NhanVien nv5 = new NhanVien("Le Trung Kien", 27, "dia chi 5", 6.75, 110);
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        System.out.println("\nBAI 2:");
        ql.inDS();
        
        //Bai3
        System.out.println("\nBAI 3:");
        SinhVienPoly svIT = new SinhVienIT("Nguyen Van An", "CNTT", 7.25, 5.5, 6.75);
        SinhVienPoly svBiz = new SinhVienBiz("Le Thi Binh", "QTKD", 6.0, 6.0);
        System.out.println("Ten \t\tLop \tDiem \tHoc luc");
        svIT.xuat();
        System.out.println(svIT.getDiem()+"\t"+svIT.getHocLuc());
        svBiz.xuat();
        System.out.println(svBiz.getDiem()+"\t"+svBiz.getHocLuc());
        
        //Bai4
        XeNoiThanh t1 = new XeNoiThanh("ABC001", "Tran Van An", "79N41", 2, 100.53f, 1500.5);
        XeNoiThanh t2 = new XeNoiThanh("ABC002", "Le Van Cuong", "79N55", 10, 950.77f, 1000.25);
        XeNgoaiThanh t3 = new XeNgoaiThanh("HJK001", "Ngo Duc Luong", "79B45", "TP.HN", 5, 2500.5);
        XeNgoaiThanh t4 = new XeNgoaiThanh("BNM003", "Le Trung Hai", "79N99", "TP.HCM", 3, 1100.75);
        
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(t1);
        qlcx.them(t2);
        qlcx.them(t3);
        qlcx.them(t4);
        System.out.println("\nBAI 4:");
        System.out.println("Chuyen xe\tMa so\tTai xe\t\tTuyen/Diem den\tKm/So ngay di\tDoanh thu");
        qlcx.inTT();
        System.out.println("\nTong doanh thu noi thanh: " + qlcx.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thu ngoai thanh: " + qlcx.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: " + qlcx.tongDoanhThu());
    }
    
}
