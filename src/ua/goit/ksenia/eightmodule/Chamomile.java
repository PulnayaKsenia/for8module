package ua.goit.ksenia.eightmodule;

public class Chamomile extends Flower{
    private Integer number;

    public Chamomile(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Numbers of Chamomile are " + number;
    }
}
