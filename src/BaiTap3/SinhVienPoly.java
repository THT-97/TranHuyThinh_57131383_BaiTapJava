/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author TranHuyThinh
 */
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        double d = this.getDiem();
        if(d<5d) {
            return "Yeu";
        }
        else if(d<6.5d){
            return "Trung Binh";
        }
        else if(d<7.5d){
            return "Kha";
        }
        else if(d<9){
            return "Gioi";
        }
        else if(d>=9){
            return "Xuat sac";
        }
        else return "NULL";
    }
    
    public void xuat(){
        System.out.print(this.hoTen + "\t" + this.nganh + "\t");
    }
}
