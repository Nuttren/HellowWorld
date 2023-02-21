package Transport;

public enum Type {
    CARS("Автомобиль"),
    TRUCKS("Грузовик"),
    BUSES ("Автобус");

    public String getType() {
        return type;
    }

    Type(String type) {
        this.type = type;
    }

    private String type;

}
