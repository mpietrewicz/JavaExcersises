package Odwracanie;

/**
 * Created by mpietrewicz on 2017-03-31.
 */
public class ReversibleDouble implements Reversible {
    Double number;

    public ReversibleDouble(int number) {
        this.number = (double) number;
    }

    @Override
    public String toString() {
        return number.toString();
    }


    public Reversible reverse() {
        this.number = 1/this.number;
        return this;
    }

    public Reversible change() {
        this.number = this.number+10;
        return this;
    }
}
