package Task_b;

public class Parents<T,V> {
        private final T age;
        private final V name;

    public Parents(T age, V name) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public V getName() {
        return name;
    }
}
