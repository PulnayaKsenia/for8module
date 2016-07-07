package ua.goit.ksenia.eightmodule;

public class Tulip extends Flower{

    private Integer madeIn;
    private Integer number;

    public Tulip(Integer madeIn, Integer number) {
        this.madeIn = madeIn;
        this.number = number;
    }

    public Integer getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(Integer madeIn) {
        this.madeIn = madeIn;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "madeIn=" + madeIn +
                ", number=" + number +
                '}';
    }
}
