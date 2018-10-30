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
public class Bola extends BangunRuang {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 22 * r * r * r) / 7/ 3;
    }
}