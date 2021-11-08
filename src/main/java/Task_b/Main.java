package Task_b;

public class Main {
    public static void main(String[] args) {
        Child<Integer> iId;
        iId = new Child<Integer>(2);
        iId.showType();

        int value = iId.getId();
        System.out.println("Value is: " + value);

        Child<String> stringChild = new Child<>("Olia23");
        stringChild.showType();

        String str = stringChild.getId();
        System.out.println("Value is: " + str);

        Parents<Integer, String> parentsF = new Parents<>(33, "Alex");
        Parents<Double, String> parentsM = new Parents<>(28.6, "Anna");

        Integer age1 = parentsF.getAge();
        Double age2 = parentsM.getAge();

        System.out.println( age1);
        System.out.println(age2);

        Friends<String, String, Integer> friends1 = new Friends<String, String, Integer>("aaa@gmail.com", "Igor", 555555);
        Friends<String, String, Double> friends2 = new Friends<String, String, Double>("aaa@gmail.com", "Igor", 55.6);
        Friends<String, String, String> friends3 = new Friends<String, String, String>("aaa@gmail.com", "Igor", "TT555555");

        Integer tel1 = friends1.getTelephone();
        Double tel2 = friends2.getTelephone();
        String tel3 = friends3.getTelephone();
        System.out.println(tel1);
        System.out.println(tel2);
        System.out.println(tel3);
    }
}
