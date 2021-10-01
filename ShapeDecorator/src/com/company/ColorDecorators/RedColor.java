package com.company.ColorDecorators;

import com.company.IShape;
import com.company.ShapeDecorator;

public class RedColor extends ShapeDecorator {
    public RedColor(IShape iShape) { super(iShape); }

    String redColor(){ return "color red "; }

    @Override
    public String draw() { return super.draw() + redColor(); }
}
