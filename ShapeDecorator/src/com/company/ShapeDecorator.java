package com.company;

public class ShapeDecorator implements IShape {
    private IShape iShape;

    public ShapeDecorator(IShape iShape) { this.iShape = iShape; }

    @Override
    public String draw() { return iShape.draw(); }
}
