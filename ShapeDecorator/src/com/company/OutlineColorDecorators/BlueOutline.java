package com.company.OutlineColorDecorators;

import com.company.IShape;
import com.company.ShapeDecorator;

public class BlueOutline extends ShapeDecorator {
    public BlueOutline(IShape iShape) { super(iShape); }

    String blueOutline(){ return "outline blue "; }

    @Override
    public String draw() { return super.draw() + blueOutline(); }
}
