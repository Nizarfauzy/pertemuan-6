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
public class Kerucut extends BangunRuang {
    private double t;
    private double r;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (1 * 22 * r * r * t)/ 7 / 3;
    }
}
