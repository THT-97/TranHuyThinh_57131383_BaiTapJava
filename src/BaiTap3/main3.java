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
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nBAI 3:");
        SinhVienPoly svIT = new SinhVienIT("Nguyen Van An", "CNTT", 7.25, 5.5, 6.75);
        SinhVienPoly svBiz = new SinhVienBiz("Le Thi Binh", "QTKD", 6.0, 6.0);
        System.out.println("Ten \t\tLop \tDiem \tHoc luc");
        svIT.xuat();
        System.out.println(svIT.getDiem()+"\t"+svIT.getHocLuc());
        svBiz.xuat();
        System.out.println(svBiz.getDiem()+"\t"+svBiz.getHocLuc());
    }
    
}
