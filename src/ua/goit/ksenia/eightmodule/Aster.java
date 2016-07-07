package ua.goit.ksenia.eightmodule;


public class Aster extends Flower{

    private Integer number = 8;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Aster(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Aster{" +
                "number=" + number +
                '}';
    }
}
