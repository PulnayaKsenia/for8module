package ua.goit.ksenia.eightmodule;

public class Chamomile extends Flower{

    private Integer number = 9;

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
        return "Chamomile{" +
                "number=" + number +
                '}';
    }
}
