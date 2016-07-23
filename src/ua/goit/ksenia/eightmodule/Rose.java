package ua.goit.ksenia.eightmodule;

public class Rose extends Flower implements Comparable<Rose> {
    private String color;
    private Integer number;

    public Rose(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color and numbers of Rose: " + color + " " + number;
    }

    @Override
    public int compareTo(Rose o) {
        return this.number - o.number;
    }
}
