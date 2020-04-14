/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author TranHuyThinh
 */
public class main1 {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Luong Van An", 35, "dia chi 1", 11.5, 250);
        NhanVien nv2 = new NhanVien("Nguyen Van Ba", 25, "dia chi 2", 5.5, 99);
        System.out.println("BAI 1:");
        System.out.println("Ten\t\tTuoi\tLuong\tGio Lam\t\tDia Chi\t\tThuong\n");
        System.out.println(nv1.getThongTin() +"\t" + nv1.tinhThuong());
        System.out.println(nv2.getThongTin() +"\t" + nv2.tinhThuong());
    }
}
