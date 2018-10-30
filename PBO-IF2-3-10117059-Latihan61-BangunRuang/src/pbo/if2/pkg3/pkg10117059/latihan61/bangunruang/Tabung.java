/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.if2.pkg3.pkg10117059.latihan61.bangunruang;

/**
 *
 * @author kitttyyyy
 */
public class Tabung extends BangunRuang {
    private double r;
    private double h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double hitungVolume() {
       return (22 * r * r * h)/ 7;
}
}
    
