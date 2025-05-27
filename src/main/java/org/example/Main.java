package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Gökçe",new Wall("N"), new Wall("S"),new Wall("W"), new Wall("E"), new Ceiling(2,PaintColor.GREEN),new Lamp(100,true,LampType.NEON),new Carpet(300,400,PaintColor.RED));
    }
}