package com.kroshz.homework_3_1;

public class Pressure {

        int pUp;
        int pDown;
        int pulse;
        int date;
        int time;
        boolean tah;

    public Pressure(int pUp, int pDown, int pulse, int date, int time, boolean tah) {
        this.pUp = pUp;
        this.pDown = pDown;
        this.pulse = pulse;
        this.date = date;
        this.time = time;
        this.tah = tah;
    }

    public int getpUp() {
        return pUp;
    }

    public void setpUp(int pUp) {
        this.pUp = pUp;
    }

    public int getpDown() {
        return pDown;
    }

    public void setpDown(int pDown) {
        this.pDown = pDown;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isTah() {
        return tah;
    }

    public void setTah(boolean tah) {
        this.tah = tah;
    }
}

