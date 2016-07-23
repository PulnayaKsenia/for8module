package ua.goit.ksenia.eightmodule;

public class Tulip extends Flower{
    private String madeIn;
    private Integer number;

    public Tulip(String madeIn, Integer number) {
        this.madeIn = madeIn;
        this.number = number;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
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
        return "Tulips are from " + madeIn + "; numbers of Tulips" + number;
    }
}
