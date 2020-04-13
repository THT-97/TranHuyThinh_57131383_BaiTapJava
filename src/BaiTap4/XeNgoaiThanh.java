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
public class XeNgoaiThanh extends ChuyenXe{
    private String diemDen;
    private int soNgay;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String maSo, String hoTenTX, String soXe, String diemDen, int soNgay, double doanhThu) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.diemDen = diemDen;
        this.soNgay = soNgay;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void inTT() {
        System.out.print("Ngoai thanh \t" + this.getMaSo() +"\t"+ this.getHoTenTX() +"\t");
        System.out.println(diemDen +"\t\t"+ soNgay +" ngay\t\t"+ this.getDoanhThu());
    }
    
}

