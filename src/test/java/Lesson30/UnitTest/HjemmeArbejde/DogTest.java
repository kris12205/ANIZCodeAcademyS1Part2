package Lesson30.UnitTest.HjemmeArbejde;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class DogTest {

    // Test beregning af hundeår
    @Test
    public void testDogYears() {
        Dog d = new Dog("Buddy", 3);
        assertEquals(21, d.calculateDogYears());
    }

    @Test
    public void testDogYearsZero() {
        Dog d = new Dog("Puppy", 0);
        assertEquals(0, d.calculateDogYears());
    }

    // Test find ældste hund
    @Test
    public void testFindOldestDog() {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("A", 2));
        dogs.add(new Dog("B", 5));
        dogs.add(new Dog("C", 3));

        Dog oldest = Dog.findOldestDog(dogs);

        assertEquals("B", oldest.getName());
    }

    // 🔹 Edge case: tom liste
    @Test
    public void testFindOldestDogEmpty() {
        ArrayList<Dog> dogs = new ArrayList<>();
        assertNull(Dog.findOldestDog(dogs));
    }

    // 🔹 Test getters
    @Test
    public void testGetters() {
        Dog d = new Dog("Max", 4);

        assertEquals("Max", d.getName());
        assertEquals(4, d.getAge());
    }
}