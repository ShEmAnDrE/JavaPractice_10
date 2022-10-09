package com.company;

public class MagicChair extends ChairFactory implements Chair{
    public void doMagic(){
        System.out.println("Трах-тиби-дох!!!");
    }

    @Override
    public String toString() {
        return "Магический стул (может творить магию)";
    }
}
