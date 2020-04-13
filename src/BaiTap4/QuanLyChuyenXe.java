/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;
/**
 *
 * @author TranHuyThinh
 */
public class QuanLyChuyenXe {
    private ArrayList<ChuyenXe> ds;

    public QuanLyChuyenXe() {
        ds = new ArrayList<>();
    }
    
    public boolean them(ChuyenXe t){
        return ds.add(t);
    }
    
    public void inTT(){
        ds.forEach((t) -> {
            t.inTT();
        });
    }
    
    public double tinhDoanhThuNoiThanh(){
        double sum = 0;
        for (int i = 0; i < ds.size(); i++) {
            if(ds.get(i) instanceof XeNoiThanh){
                sum += ds.get(i).getDoanhThu();
            }
        }
        return sum;
    }
    
    public double tinhDoanhThuNgoaiThanh(){
        double sum = 0;
        for (int i = 0; i < ds.size(); i++) {
            if(ds.get(i) instanceof XeNgoaiThanh){
                sum += ds.get(i).getDoanhThu();
            }
        }
        return sum;
    }
    
    public double tongDoanhThu(){
        double sum = 0;
        for (int i = 0; i < ds.size(); i++) {
            sum += ds.get(i).getDoanhThu();
        }
        return sum;
    }
}
