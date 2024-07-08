/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author winhtuan
 */
public class ShapeList {

    public static final String FILE_NAME = "D:\\FPT_SU24\\PRO192 - Object-Oriented Programming\\Assignment\\Assignment Shape\\Data.txt";
    static ArrayList<Shape> shapes = new ArrayList<>();

    public static ArrayList<Shape> getAllShapes() {
        return new ArrayList<>(shapes);
    }

    public static void addShape(Shape s) {
        shapes.add(s);
        saveToFile();
    }

    public static void removeShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            shapes.remove(index);
        }
        saveToFile();
    }

    public static void loadFromFile() throws FileNotFoundException, IOException {
        try (BufferedReader file = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            shapes.clear(); // Clear the list before loading new data

            while ((line = file.readLine()) != null) {
                String[] data = line.split(", ");

                if (data.length > 2) {
                    String shapeType = data[1];
                    double value;

                    switch (shapeType) {
                        case "Circle":
                            value = Double.parseDouble(data[2]);
                            shapes.add(new Circle(value));
                            break;
                        case "Square":
                            value = Double.parseDouble(data[2]);
                            shapes.add(new Square(value));
                            break;
                        case "Triangle":
                            double base = Double.parseDouble(data[2]);
                            double height = Double.parseDouble(data[3]);
                            shapes.add(new Triangle(base, height));
                            break;
                        case "Sphere":
                            value = Double.parseDouble(data[2]);
                            shapes.add(new Sphere(value));
                            break;
                        case "Cube":
                            value = Double.parseDouble(data[2]);
                            shapes.add(new Cube(value));
                            break;
                        case "Tetrahedron":
                            value = Double.parseDouble(data[2]);
                            shapes.add(new Tetrahedron(value));
                            break;
                        default:
                            System.out.println("Invalid shape type: " + shapeType);
                            break;
                    }
                } else {
                    System.out.println("Invalid Input " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }

    public static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, false))) {
            for (Shape shape : shapes) {
                if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    bw.write(String.format("2D, Circle, %.2f", circle.getRadius()));
                } else if (shape instanceof Square) {
                    Square square = (Square) shape;
                    bw.write(String.format("2D, Square, %.2f", square.getSide()));
                } else if (shape instanceof Triangle) {
                    Triangle triangle = (Triangle) shape;
                    bw.write(String.format("2D, Triangle, %.2f, %.2f", triangle.getBase(), triangle.getHeight()));
                } else if (shape instanceof Sphere) {
                    Sphere sphere = (Sphere) shape;
                    bw.write(String.format("3D, Sphere, %.2f", sphere.getRadius()));
                } else if (shape instanceof Cube) {
                    Cube cube = (Cube) shape;
                    bw.write(String.format("3D, Cube, %.2f", cube.getSide()));
                } else if (shape instanceof Tetrahedron) {
                    Tetrahedron tetrahedron = (Tetrahedron) shape;
                    bw.write(String.format("3D, Tetrahedron, %.2f", tetrahedron.getSide()));
                }
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Error saving books to file: " + ex.getMessage());
        }
    }

}
