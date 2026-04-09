public enum Language {
    SPANISH("Español"),
    ENGLISH("Inglés"),
    PORTUGUESE("Portugués");

    private final String displayName;

    Language(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}