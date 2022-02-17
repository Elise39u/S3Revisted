package Location;

public class Location {
    private int id;
    private String title;
    private String imgLink;
    private String story;

    public int getLocationId() {
        return this.id;
    }

    public String getLocationTitle() {
        return this.title;
    }

    public String getImgLink() {
        return this.imgLink;
    }

    public String getLocationStory() {
        return this.story;
    }

    protected Location(int locationId, String locationTitle, String locationImgLink, String locationStory) {
        this.id = locationId;
        this.title = locationTitle;
        this.imgLink = locationImgLink;
        this.story = locationStory;
    }
}
