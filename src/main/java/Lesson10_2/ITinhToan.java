package Lesson10_2;

public interface ITinhToan<T> {
    public T cong(T...args);
    public T tru(T...args);
    public T nhan(T...args);
    public T chia(T...args);
}
