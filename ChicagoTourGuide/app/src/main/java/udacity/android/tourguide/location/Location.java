package udacity.android.tourguide.location;

/**
 * This class represents a Location object for the Tour Guide App.
 * The location's title, address, and website are held along with
 * a picture of the location.
 *
 * @author Joseph Stewart
 * @version 1.1
 */
public class Location {

    private String locationTitle;
    private String address;
    private String website;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constructors */
    public Location() {

    }

    public Location(String locationTitle, String address, String website, int imageResourceId) {
        this.locationTitle = locationTitle;
        this.address = address;
        this.website = website;
        this.imageResourceId = imageResourceId;
    }

    public Location(String locationTitle, String address, String website) {
        this.locationTitle = locationTitle;
        this.address = address;
        this.website = website;
    }

    public Location(String locationTitle, String address) {
        this.locationTitle = locationTitle;
        this.address = address;
    }

    /**
     * This method returns the address.
     *
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method sets the address.
     *
     * @param address The new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns the website.
     *
     * @return The website.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method sets the website.
     *
     * @param website The new website.
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * This method returns the title of the location.
     *
     * @return The title of the location.
     */
    public String getLocationTitle() {
        return locationTitle;
    }

    /**
     * This method sets a new title for the location.
     *
     * @param locationTitle The new title.
     */
    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    /**
     * This method returns the resource id for the image.
     *
     * @return The image resource id.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * This method sets the image resource id.
     *
     * @param imageResourceId The new resource id for the image.
     */
    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    /**
     * This method tests whether or not the location has an image associated with it.
     *
     * @return True if the location has an image associated with it; false otherwise.
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
