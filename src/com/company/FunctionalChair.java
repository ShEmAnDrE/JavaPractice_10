package com.company;

public class FunctionalChair extends ChairFactory implements Chair{
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public String toString() {
        return "Многофункциональный стул (может складывать числа)";
    }
}
