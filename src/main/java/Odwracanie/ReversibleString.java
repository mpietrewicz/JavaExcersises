package Odwracanie;

/**
 * Created by mpietrewicz on 2017-03-31.
 */
public class ReversibleString implements Reversible {
    public String text;

    public ReversibleString(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public Reversible reverse() {
        this.text = new StringBuffer(this.text).reverse().toString();
        return this;
    }

    public Reversible change() {
        this.text = "Tekst " + this.text;
        return this;
    }
}
