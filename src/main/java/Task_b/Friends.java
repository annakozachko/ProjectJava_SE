package Task_b;

public class Friends<T,V,S> {
    private  final T email;
    private final V name;
    private  final S telephone;

    public Friends(T email, V name, S telephone) {
        this.email = email;
        this.name = name;
        this.telephone = telephone;
    }

    public T getEmail() {
        return email;
    }

    public V getName() {
        return name;
    }

    public S getTelephone() {
        return telephone;
    }
}
