package Lesson30.UnitTest.HjemmeArbejde;

public class Dog {

    // Private attributter (indkapsling)
    private String name;
    private int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Beregn hundeår (simpel logik)
    public int calculateDogYears() {
        // En klassisk regel: 1 menneskeår = 7 hundeår
        return age * 7;
    }

    // Find ældste hund i en liste
    public static Dog findOldestDog(java.util.ArrayList<Dog> dogs) {

        // Hvis listen er tom → returner null
        if (dogs == null || dogs.isEmpty()) {
            return null;
        }

        Dog oldest = dogs.get(0);

        for (Dog d : dogs) {
            if (d.getAge() > oldest.getAge()) {
                oldest = d;
            }
        }

        return oldest;
    }
}