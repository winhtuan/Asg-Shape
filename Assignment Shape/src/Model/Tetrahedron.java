/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author winhtuan
 */
public class Tetrahedron extends ThreeDimensionalShape {

    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) / 12) * side * side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
}
