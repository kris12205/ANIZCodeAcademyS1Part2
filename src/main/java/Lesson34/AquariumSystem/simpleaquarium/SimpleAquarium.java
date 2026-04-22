package Lesson34.AquariumSystem.simpleaquarium;

import Lesson34.AquariumSystem.interfaces.Aquarium;
import Lesson34.AquariumSystem.model.WaterQuality;

import java.time.LocalDateTime;


public class SimpleAquarium implements Aquarium {

    private LocalDateTime lastWaterChange;
    private int feedCounter = 0;

    @Override
    public void feedFish() {
        if (feedCounter == 3) {
            System.out.println("Fastedag!");
            feedCounter = 0;
        } else {
            System.out.println("Fiskene fodres");
            feedCounter++;
        }
    }

    @Override
    public void registerWaterChange(String note, WaterQuality quality) {
        // INGEN validation her længere
        lastWaterChange = LocalDateTime.now();
        System.out.println("Vand skiftet: " + lastWaterChange + " | " + quality + " | " + note);
    }

    @Override
    public LocalDateTime getLastWaterChange() {
        return lastWaterChange;
    }
}