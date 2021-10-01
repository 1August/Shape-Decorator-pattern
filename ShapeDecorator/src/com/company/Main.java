package com.company;

import com.company.ColorDecorators.BlueColor;
import com.company.ColorDecorators.RedColor;
import com.company.OutlineColorDecorators.BlueOutline;
import com.company.OutlineColorDecorators.RedOutline;
import com.company.Shapes.Circle;
import com.company.Shapes.Heart;

public class Main {

    public static void main(String[] args) {
        IShape circle = new BlueOutline(new BlueColor(new Circle()));
        IShape heart = new RedOutline(new RedColor(new Heart()));

        System.out.println(circle.draw());
        System.out.println(heart.draw());
    }
}
