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
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private Double luong;
    private int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, Double luong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luong = luong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public String getThongTin(){
        String tt = ten +"\t"+ tuoi +"\t"+ luong+"\t"+ tongGioLam;
        return tt +"\t\t"+ diaChi;
    }
    
    public Double tinhThuong(){
        if(tongGioLam>=200) return luong*20/100;
        else if(tongGioLam>=100) return luong*10/100;
        else return 0d;
    }
}
