package Choice;

public class Choice {
    private int id;
    private int fromLocationId;
    private int toLocationId;
    private String choiceName;

    public int getId() {
        return this.id;
    }

    public int getFromLocationId() {
        return this.fromLocationId;
    }

    public int getToLocationId() {
        return this.toLocationId;
    }

    public String getChoiceName() {
        return choiceName;
    }

    public Choice(int id, int fromLocationId, int toLocationId, String choiceName) {
        this.id = id;
        this.fromLocationId = fromLocationId;
        this.toLocationId = toLocationId;
        this.choiceName = choiceName;
    }
}
