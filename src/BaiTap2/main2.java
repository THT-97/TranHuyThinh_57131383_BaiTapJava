/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author TranHuyThinh
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Luong Van An", 35, "dia chi 1", 11.5, 250);
        NhanVien nv2 = new NhanVien("Nguyen Van Ba", 25, "dia chi 2", 5.5, 99);
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
    }
    
}
