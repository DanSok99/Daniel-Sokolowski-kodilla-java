package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<>();
    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapeList.remove(shape);
    }
    public Shape getFigure(int n){
        if(n >= 0 && n < shapeList.size()){
            return shapeList.get(n);
        }else{
            return null;
        }
    }
    public void showFigures(){
        System.out.println(shapeList.toString());
    }
    public int getQuantity(){
        return shapeList.size();
    }
    public List<Shape> getShapeList(){
        return shapeList;
    }

}
