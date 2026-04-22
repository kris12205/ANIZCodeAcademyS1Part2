package Lesson34.AquariumSystem.simpleaquarium;

import Lesson34.AquariumSystem.interfaces.Fish;
import java.time.LocalDateTime;

public class SimpleFish implements Fish {

    private String name;

    public SimpleFish(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void registerHealthCheck(String note) {
        System.out.println(LocalDateTime.now() + ": " + name + " -> " + note);
    }

    //VIGTIG
    @Override
    public String toString() {
        return name;
    }
}