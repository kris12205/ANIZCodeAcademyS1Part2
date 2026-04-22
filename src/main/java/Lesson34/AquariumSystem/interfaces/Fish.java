package Lesson34.AquariumSystem.interfaces;

public interface Fish {
    void setName(String name);

    String getName();
    void registerHealthCheck(String note);
}