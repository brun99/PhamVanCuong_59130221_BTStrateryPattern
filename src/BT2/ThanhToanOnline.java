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
public class ThanhToanOnline implements IThanhToan{

    public ThanhToanOnline() {
    }
    
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return (double)tienHang*0.95;
        else
            return (double)tienHang*0.93;
    }
    
}
