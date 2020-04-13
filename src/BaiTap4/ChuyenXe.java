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
public abstract class ChuyenXe {
    private String maSo;
    private String hoTenTX;
    private String soXe;
    private double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSo, String hoTenTX, String soXe, double doanhThu) {
        this.maSo = maSo;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public abstract void inTT();
}
