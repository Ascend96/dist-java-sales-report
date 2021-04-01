package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoll;

import java.util.Random;

public class D4 implements DiceRoll {

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
