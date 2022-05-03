package AnimalBeing;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Crocodile crocodile = new Crocodile();
        Kangaroo kangaroo = new Kangaroo();

        tiger.setName("Pussy");
        tiger.setType("Chordate");
        tiger.setWeight(100);

        System.out.println("The name of the tiger is: " + "\"" + tiger.getName() +  "\". " +"\n" +
                "Tigers are: " + tiger.getType() + "\n" +
                "And his weight is approximately: " + tiger.getWeight());


        crocodile.setName("Crocs");
        crocodile.setType("Chordate");

        System.out.println("The name of our croci is: " + "\"" + crocodile.getName() + "\". "+ "\n" +
                "Crocs are: " + crocodile.getType());

        kangaroo.setName("Jumper");
        kangaroo.setType("Chordate");

        System.out.println("The name of our Kangaroo is: " + "\"" + kangaroo.getName() + "\"" + "\n" +
                "Kangaroos are " + kangaroo.getType());

    }
}
