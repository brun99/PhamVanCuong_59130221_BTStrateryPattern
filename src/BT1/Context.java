/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Cuong Pham
 */
public class Context {
    ITinh tinhToan;

    public Context() {
    }
    
    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public float Tinh(float a, float b){        
        return tinhToan.Tinh(a, b);
    }
}
