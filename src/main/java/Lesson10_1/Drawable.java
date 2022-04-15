package Lesson10_1;

public class Drawable <T>{
    T t;

    public Drawable() {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void draw(T t) {
        System.out.println("Vẽ ra "+t.toString());
    }
}
