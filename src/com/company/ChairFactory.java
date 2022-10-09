package com.company;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(1800 + (int)(Math.random()*100.0));
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
