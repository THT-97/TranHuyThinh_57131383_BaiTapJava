/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranhuythinh_57131383_baitapjava;

import BaiTap1.NhanVien;
import BaiTap2.QuanLyNhanVien;

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
        NhanVien nv1 = new NhanVien("Luong Van An", 35, "dia chi 1", 11.5d, 250);
        NhanVien nv2 = new NhanVien("Nguyen Van Ba", 25, "dia chi 2", 5.5d, 99);
        
        System.out.println("Ten\t\tTuoi\tLuong\tGio Lam\t\tDia Chi\t\tThuong\n");
        System.out.println(nv1.getThongTin() +"\t" + nv1.tinhThuong() +"\n");
        System.out.println(nv2.getThongTin() +"\t" + nv2.tinhThuong() +"\n");
        
        //Bai 2
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.them(nv1);
        ql.them(nv2);
        ql.inDS();
    }
    
}
