package Lesson34.AquariumSystem.validation;

import Lesson34.AquariumSystem.exception.ValidationException;

public class NoteValidator {

    public static void validate(String note, int maxLength) {
        if (note == null || note.isEmpty()) {
            throw new ValidationException("Note må ikke være tom");
        }

        if (note.length() > maxLength) {
            throw new ValidationException("Note er for lang (max " + maxLength + ")");
        }
    }
}