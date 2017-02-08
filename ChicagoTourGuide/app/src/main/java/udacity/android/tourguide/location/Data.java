package udacity.android.tourguide.location;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import udacity.android.tourguide.R;
import udacity.android.tourguide.activities.App;

/**
 * This class serves as the data source for the app. Each location category
 * has a list of locations and an identifying String.
 *
 * @author Joseph Stewart
 * @version 1.2
 */
public class Data {

    Context context = App.getContext();

    // Strings for the various categories
    public String HOTELS = context.getString(R.string.activity_hotels_label);
    public String RESTAURANTS = context.getString(R.string.activity_restaurants_label);
    public String MUSEUMS = context.getString(R.string.activity_museums_label);
    public String THEATERS = context.getString(R.string.activity_theaters_label);
    public String ATTRACTIONS = context.getString(R.string.activity_attractions_label);

    // Lists containing the data
    private List<Location> hotels = setHotels();
    private List<Location> restaurants = setRestaurants();
    private List<Location> museums = setMuseums();
    private List<Location> theaters = setTheaters();
    private List<Location> attractions = setAttractions();

    /**
     * This method returns the hotels list.
     *
     * @return The hotels list.
     */
    public List<Location> getHotels() {
        return hotels;
    }

    /**
     * This method sets the data for the hotels list.
     *
     * @return The populated list.
     */
    private List<Location> setHotels() {
        hotels = new ArrayList<>();
        hotels.add(new Location(context.getString(R.string.hotels_jw_name), context.getString(R.string.hotels_jw_address), context.getString(R.string.hotels_jw_web)));
        hotels.add(new Location(context.getString(R.string.hotels_renaissance_name), context.getString(R.string.hotels_renaissance_address), context.getString(R.string.hotels_renaissance_web)));
        hotels.add(new Location(context.getString(R.string.hotels_courtyard_name), context.getString(R.string.hotels_courtyard_address), context.getString(R.string.hotels_courtyard_web)));
        hotels.add(new Location(context.getString(R.string.hotels_hyatt_name), context.getString(R.string.hotels_hyatt_address), context.getString(R.string.hotels_hyatt_web)));
        hotels.add(new Location(context.getString(R.string.hotels_congress_name), context.getString(R.string.hotels_congress_address), context.getString(R.string.hotels_congress_web)));
        hotels.add(new Location(context.getString(R.string.hotels_trump_name), context.getString(R.string.hotels_trump_address), context.getString(R.string.hotels_trump_web)));
        return hotels;
    }

    /**
     * This method returns the restaurants list.
     *
     * @return The restaurants list.
     */
    public List<Location> getRestaurants() {
        return restaurants;
    }

    /**
     *  This method sets the data for the restaurant list.
     *
     * @return The populated list.
     */
    private List<Location> setRestaurants() {
        restaurants = new ArrayList<>();
        restaurants.add(new Location(context.getString(R.string.restaurants_purple_pig_name), context.getString(R.string.restaurants_purple_pig_address), context.getString(R.string.restaurants_purple_pig_web)));
        restaurants.add(new Location(context.getString(R.string.restaurants_rpm_name), context.getString(R.string.restaurants_rpm_address), context.getString(R.string.restaurants_rpm_web)));
        restaurants.add(new Location(context.getString(R.string.restaurants_shanghai_name), context.getString(R.string.restaurants_shanghai_address), context.getString(R.string.restaurants_shanghai_web)));
        restaurants.add(new Location(context.getString(R.string.restaurants_ginos_name), context.getString(R.string.restaurants_ginos_address), context.getString(R.string.restaurants_ginos_web)));
        restaurants.add(new Location(context.getString(R.string.restaurants_gibsons_name), context.getString(R.string.restaurants_gibsons_address), context.getString(R.string.restaurants_gibsons_web)));
        restaurants.add(new Location(context.getString(R.string.restaurants_goat_name), context.getString(R.string.restaurants_goat_address), context.getString(R.string.restaurants_goat_web)));
        return restaurants;
    }

    /**
     * This method returns the museums list.
     *
     * @return The museums list.
     */
    public List<Location> getMuseums() {
        return museums;
    }

    /**
     * This method sets the data for the museums list.
     *
     * @return The populated list.
     */
    private List<Location> setMuseums() {
        museums = new ArrayList<>();
        museums.add(new Location(context.getString(R.string.museums_pritzker_name), context.getString(R.string.museums_pritzker_address), context.getString(R.string.museums_pritzker_web), R.drawable.pritzker));
        museums.add(new Location(context.getString(R.string.museums_field_name), context.getString(R.string.museums_field_address), context.getString(R.string.museums_field_web), R.drawable.field_museum));
        museums.add(new Location(context.getString(R.string.museums_msi_name), context.getString(R.string.museums_msi_address), context.getString(R.string.museums_msi_web), R.drawable.msi));
        museums.add(new Location(context.getString(R.string.museums_art_name), context.getString(R.string.museums_art_address), context.getString(R.string.museums_art_web), R.drawable.art_institute));
        museums.add(new Location(context.getString(R.string.museums_adler_name), context.getString(R.string.museums_adler_address), context.getString(R.string.museums_adler_web), R.drawable.adler));
        museums.add(new Location(context.getString(R.string.museums_contempporary_name), context.getString(R.string.museums_contempporary_address), context.getString(R.string.museums_contempporary_web), R.drawable.contemporary_art));
        museums.add(new Location(context.getString(R.string.museums_dusable_name), context.getString(R.string.museums_dusable_address), context.getString(R.string.museums_dusable_web), R.drawable.dusable));
        museums.add(new Location(context.getString(R.string.museums_childrens_name), context.getString(R.string.museums_childrens_address), context.getString(R.string.museums_childrens_web), R.drawable.childrens_museum));
        museums.add(new Location(context.getString(R.string.museums_broadcast_name), context.getString(R.string.museums_broadcast_address), context.getString(R.string.museums_broadcast_web), R.drawable.mbc));
        museums.add(new Location(context.getString(R.string.museums_polish_name), context.getString(R.string.museums_polish_address), context.getString(R.string.museums_polish_web)));
        return museums;
    }

    /**
     * This method returns the theaters list.
     *
     * @return The theaters list.
     */
    public List<Location> getTheaters() {
        return theaters;
    }

    /**
     * This method sets the data for the theaters list.
     *
     * @return The populated list.
     */
    private List<Location> setTheaters() {
        theaters = new ArrayList<>();
        theaters.add(new Location(context.getString(R.string.theaters_chicago_name), context.getString(R.string.theaters_chicago_address), context.getString(R.string.theaters_chicago_web)));
        theaters.add(new Location(context.getString(R.string.theaters_cadillac_name), context.getString(R.string.theaters_cadillac_address), context.getString(R.string.theaters_cadillac_web)));
        theaters.add(new Location(context.getString(R.string.theaters_oriental_name), context.getString(R.string.theaters_oriental_address), context.getString(R.string.theaters_oriental_web)));
        theaters.add(new Location(context.getString(R.string.theaters_apollo_name), context.getString(R.string.theaters_apollo_address), context.getString(R.string.theaters_apollo_web)));
        theaters.add(new Location(context.getString(R.string.theaters_arie_name), context.getString(R.string.theaters_arie_address), context.getString(R.string.theaters_arie_web)));
        theaters.add(new Location(context.getString(R.string.theaters_shakespeare_name), context.getString(R.string.theaters_shakespeare_address), context.getString(R.string.theaters_shakespeare_web)));
        return theaters;
    }

    /**
     * This method returns the attractions list.
     * @return The attractions list.
     */
    public List<Location> getAttractions() {
        return attractions;
    }

    /**
     * This method sets the data for the attractions list.
     *
     * @return The populated list.
     */
    private List<Location> setAttractions() {
        attractions = new ArrayList<>();
        attractions.add(new Location(context.getString(R.string.attractions_north_name), context.getString(R.string.attractions_north_address), context.getString(R.string.attractions_north_web), R.drawable.north_avenue_beach));
        attractions.add(new Location(context.getString(R.string.attractions_navy_name), context.getString(R.string.attractions_navy_address), context.getString(R.string.attractions_navy_web), R.drawable.navy_pier));
        attractions.add(new Location(context.getString(R.string.attractions_grant_name), context.getString(R.string.attractions_grant_address), context.getString(R.string.attractions_grant_web), R.drawable.grant_park));
        attractions.add(new Location(context.getString(R.string.attractions_millenium_name), context.getString(R.string.attractions_millenium_address), context.getString(R.string.attractions_millenium_web), R.drawable.millenium_park));
        attractions.add(new Location(context.getString(R.string.attractions_wrigley_name), context.getString(R.string.attractions_wrigley_address), context.getString(R.string.attractions_wrigley_web), R.drawable.wrigley_field));
        attractions.add(new Location(context.getString(R.string.attractions_hancock_name), context.getString(R.string.attractions_hancock_address), context.getString(R.string.attractions_hancock_web), R.drawable.hancock));
        attractions.add(new Location(context.getString(R.string.attractions_zoo_name), context.getString(R.string.attractions_zoo_address), context.getString(R.string.attractions_zoo_web), R.drawable.lincoln_park));
        attractions.add(new Location(context.getString(R.string.attractions_willis_name), context.getString(R.string.attractions_willis_address), context.getString(R.string.attractions_willis_web), R.drawable.willis_tower));
        attractions.add(new Location(context.getString(R.string.attractions_mile_name), context.getString(R.string.attractions_mile_address), context.getString(R.string.attractions_mile_web), R.drawable.magnificent_mile));
        return attractions;
    }

}
