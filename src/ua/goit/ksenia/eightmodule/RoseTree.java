package ua.goit.ksenia.eightmodule;

public class RoseTree extends Flower {
    private String color;
    private Integer number;

    public RoseTree(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    private Rose rose;

    public Rose getRose() {
        return rose;
    }

    public void setRose(Rose rose) {
        this.rose = rose;
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
        return "RoseTree{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
