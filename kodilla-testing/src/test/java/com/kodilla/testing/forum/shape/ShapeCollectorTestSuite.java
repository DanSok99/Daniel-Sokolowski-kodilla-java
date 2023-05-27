package com.kodilla.testing.forum.shape;

import com.kodilla.testing.shape.*;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Testing ShapeCollector")
    @Test
    void testAddShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        //When
        shapeCollector.addFigure(square);
        //Then
        assertEquals(1, shapeCollector.getQuantity());
    }
    @Test
    void testRemoveShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        assertTrue(result);
    }
    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);
        //When
        Shape shape;
        shape = shapeCollector.getFigure(0);
        //Then
        assertEquals(circle, shape);
    }
    @Test
    void testShowFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        //When
        List<Shape> shapeResult = shapeCollector.getShapeList();
        //Then
        assertEquals(shapeList.toString(),shapeResult.toString());
    }
}