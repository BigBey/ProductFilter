package utils;

import java.lang.reflect.Type;

public class Pair<D, Y> extends Object{
    public D first;
    public Y second;

    public Pair(D first, Y second) {
        this.first = first;
        this.second = second;
    }

    public D getFirst() {
        return first;
    }

    public void setFirst(D first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }
}
