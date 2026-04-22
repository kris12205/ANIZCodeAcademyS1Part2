package Lesson34.AquariumSystem.interfaces;

import Lesson34.AquariumSystem.model.WaterQuality;
import java.time.LocalDateTime;

public interface Aquarium {
    void feedFish();
    void registerWaterChange(String note, WaterQuality quality);
    LocalDateTime getLastWaterChange();
}