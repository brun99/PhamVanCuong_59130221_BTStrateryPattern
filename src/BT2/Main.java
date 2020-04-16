/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) {
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        
        IThanhToan TT1 = new ThanhToanOnline();
        GH1.setHinhThucTT(new ThanhToanOnline());
        GH2.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa HH1 = new HangHoa("bsc",25000,"su dung 1lan");
        HangHoa HH2 = new HangHoa("keo",1000,"su dung 1lan");
        HangHoa HH3 = new HangHoa("banh",2000,"su dung 1lan");
        
         GH1.them(HH1);
         GH1.them(HH2);
         GH1.them(HH3);
        System.out.println("giỏ hang 1");
        GH1.hienThi();
        System.out.println("Tổng tiền :" +GH1.tinhTienH()+"\n số tiền trả :" +GH1.tienTra());
        
        
        GH2.them(HH1);
        GH2.them(HH2);
        GH2.them(HH3);
        System.out.println("\ngiỏ hang 2");
        GH2.hienThi();
        System.out.println("Tổng tiền :" +GH2.tinhTienH()+"\n số tiền trả :" +GH2.tienTra());
    }
}
