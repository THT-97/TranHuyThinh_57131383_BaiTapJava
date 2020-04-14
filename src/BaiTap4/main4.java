/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author TranHuyThinh
 */
public class main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
