/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Cuong Pham
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien sv1, SinhVien sv2) {
        
     return sv1.getHoTen().compareTo(sv2.getHoTen());   
    }
}
