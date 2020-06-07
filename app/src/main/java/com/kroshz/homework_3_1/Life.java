package com.kroshz.homework_3_1;

public class Life {
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Life(int weight, int steps) {
        this.weight = weight;
        this.steps = steps;
    }

    int steps;
}
