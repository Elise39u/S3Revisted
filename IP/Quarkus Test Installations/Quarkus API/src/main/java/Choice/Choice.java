package Choice;

public class Choice {
    private int fromLocationId;
    private int toLocationId;
    private String choiceName;

    public int getFromLocationId() {
        return this.fromLocationId;
    }

    public int getToLocationId() {
        return this.toLocationId;
    }

    public String getChoiceName() {
        return choiceName;
    }

    public Choice(int fromLocationId, int toLocationId, String choiceName) {
        this.fromLocationId = fromLocationId;
        this.toLocationId = toLocationId;
        this.choiceName = choiceName;
    }
}
