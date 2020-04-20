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
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien sv1, SinhVien sv2) {
        if(sv1.getDiemTB() > sv2.getDiemTB())
        return 1;
        else if(sv1.getDiemTB() == sv2.getDiemTB())
            return 0;
        return -1;
    }
}
