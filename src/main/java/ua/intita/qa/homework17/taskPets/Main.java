package ua.intita.qa.homework17.taskPets;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<String, Pet>();
        pets.put("Barsik", new Cat());
        pets.put("Bobik", new Dog());
        pets.put("Kesha", new Parrot());

//        ScannerMenu sm = new ScannerMenu();
//        Scanner petInput = new Scanner(System.in);
//        sm.menuPrint();
//
//        while (petInput.hasNext()){
//            sm.menuChoice(petInput.nextInt());
//        }

        pets.put("Kisa", new Tiger());
        pets.put("Pi", new Mouse());

        Set<?> keys = pets.keySet();
        System.out.println(keys);

        Stream<?> animalStream = Stream.of(
                new Animal("Kisa", 2),
                new Animal("Pi", 1),
                new Animal("Barsik",3),
                new Animal("Bobik", 5),
                new Animal("Kesha", 2));

        animalStream.sorted(new AnimalComparator()).forEach(p-> System.out.println("%s (%s) - %d \n",
                p.getName(),
                p.getAge()));







//        Cat  t= (Cat)pets.get("Barsik");
//        t.vvv();
//        t.setName("Go");

//        public void vvv(Object o){
//
//        }
        //1System.out.print("Input:" + pets.get("Barsik") );




    }
}
