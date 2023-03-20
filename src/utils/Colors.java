package utils;

public enum Colors {
    WHITE ("white"),
    RED ("red"),
    BLUE ("blue"),
    BLACK ("black");

    private String title;

    Colors(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }
}
