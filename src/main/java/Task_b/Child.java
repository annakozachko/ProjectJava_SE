package Task_b;

public class Child <T>{
     T id;

    public Child(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    void showType(){
        System.out.println("The type T is :" + id.getClass().getName());
    }
}
