package Location;

import Choice.Choice;
import org.jboss.resteasy.spi.NotImplementedYetException;

import java.util.List;

public class Location {
    private int id;
    private String title;
    private String imgLink;
    private String story;
    private List<Choice> choices;

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

    public List<Choice> getChoicesForLocation() {
        throw new NotImplementedYetException();
    }

    protected Location(int locationId, String locationTitle, String locationImgLink, String locationStory) {
        this.id = locationId;
        this.title = locationTitle;
        this.imgLink = locationImgLink;
        this.story = locationStory;
        this.choices = this.getChoicesForLocation();
    }
}
