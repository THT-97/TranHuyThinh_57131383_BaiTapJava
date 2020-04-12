/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author TranHuyThinh
 */
public class QuanLyNhanVien implements IQuanLy{
    private ArrayList<NhanVien> ds;
    
    public QuanLyNhanVien() {
        ds = new ArrayList<>();
    }

    @Override
    public void them(NhanVien nv) {
        ds.add(ds.size(), nv);
    }

    @Override
    public void inDS() {
        System.out.println("Ten\t\tTuoi\tLuong\tGio Lam\t\tDia Chi\t\tThuong\n");
        ds.forEach((nv) -> {
            System.out.println(nv.getThongTin() +"\t" + nv.tinhThuong());
        });
    }
    
}
