package ua.goit.ksenia.eightmodule;

public class Flower {
    private String name;
    private Integer number;
    private String color;
    private String madeIn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return name + " : " + number + " - " + color + " - " + madeIn;
    }
}
