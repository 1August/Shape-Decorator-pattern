package com.company.ColorDecorators;

import com.company.IShape;
import com.company.ShapeDecorator;

public class BlueColor extends ShapeDecorator {
    public BlueColor(IShape iShape) { super(iShape); }

    String blueColor(){ return "color blue "; }

    @Override
    public String draw() { return super.draw() + blueColor(); }
}
