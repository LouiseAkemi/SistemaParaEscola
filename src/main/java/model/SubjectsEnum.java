package model;

public enum SubjectsEnum {
    MATH("Matemática"),PORTUGUESE("Português"),ENGLISH("Inglês");

    private final String label;

    SubjectsEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
