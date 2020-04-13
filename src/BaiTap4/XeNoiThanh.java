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
public class XeNoiThanh extends ChuyenXe{
    private int tuyen;
    private float km;

    public XeNoiThanh() {
    }

    public XeNoiThanh(String maSo, String hoTenTX, String soXe, int tuyen, float km, double doanhThu) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.tuyen = tuyen;
        this.km = km;
    }

    public int getTuyen() {
        return tuyen;
    }

    public void setTuyen(int tuyen) {
        this.tuyen = tuyen;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    @Override
    public void inTT() {
        System.out.print("Noi thanh \t" + this.getMaSo() +"\t"+ this.getHoTenTX() +"\t");
        System.out.println(tuyen +"\t\t"+ km +"km\t"+ this.getDoanhThu());
    }
    
}
