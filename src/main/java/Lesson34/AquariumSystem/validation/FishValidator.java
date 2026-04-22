package Lesson34.AquariumSystem.validation;


public class FishValidator {

    public static void validateHealthNote(String note) {
        NoteValidator.validate(note, 30);
    }
}