package com.company.OutlineColorDecorators;

import com.company.IShape;
import com.company.ShapeDecorator;

public class RedOutline extends ShapeDecorator {
    public RedOutline(IShape iShape) { super(iShape); }

    String redOutline(){ return "outline red "; }

    @Override
    public String draw() { return super.draw() + redOutline(); }
}
