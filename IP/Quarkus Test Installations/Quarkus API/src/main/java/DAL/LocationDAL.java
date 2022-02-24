package DAL;

import Models.Location;
import Models.Choice;
import org.jboss.resteasy.spi.NotImplementedYetException;

import java.util.List;


public class LocationDAL {

    private List<Choice> locationChoices;

    public Location getLocationById(int locationId) {
        if(locationId == 1) {
            return new Location(1, "the beginning", "/Img/Begin.png", "Test");
        }
        else {
            return new Location();
        }
    }

    public String deleteLocation(int locationId) {
        if(locationId == 1) {
            return "Location with " + locationId + " has been deleted";
        }
        else {
            return "We are sorry but nothings has happened";
        }
    }

    public Location updateLocation(Location location) {
        Location oldLocation = getLocationById(location.getLocationId());

        return new Location(
                oldLocation.getLocationId(),
                location.getLocationTitle(),
                location.getImgLink(),
                location.getLocationTitle()
        );
    }

    public String updateUserLocation() {
        throw new NotImplementedYetException();
    }

    public String addLocation(Location location) {
        throw new NotImplementedYetException();
    }

    public List<Choice> getLocationChoices(int locationId) {
        if (locationId == 1) {
            locationChoices.add(new Choice(1, 1, 2, "To the bedroom"));
            locationChoices.add(new Choice(2, 1, 3, "To the Kitchen"));
            locationChoices.add(new Choice(3, 1, 4, "To the Garden"));
        }

        return locationChoices;
    }
}
