package udacity.android.tourguide.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

import udacity.android.tourguide.R;
import udacity.android.tourguide.location.Data;
import udacity.android.tourguide.location.Location;
import udacity.android.tourguide.location.LocationAdapter;

/**
 * This is the activity for the chosen category. All categories
 * share common information which allows them to all share this
 * activity with different data.
 *
 * @author Joseph Stewart
 * @version 2.0
 */
public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        // The selected category
        String category = getIntent().getExtras().getString("locationCategory");

        List<Location> locations = setLocations(category);

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.list_layout);
        listView.setAdapter(adapter);
    }

    /**
     * This method determines and returns the data for the
     * chosen category.
     *
     * @param category The chosen category.
     * @return The List of data for the chosen category.
     */
    private List<Location> setLocations(String category) {
        if(category != null) {
            Data data = new Data();

            if(category.equalsIgnoreCase(data.HOTELS)) {
                setTitle(data.HOTELS);
                return data.getHotels();
            } else if(category.equalsIgnoreCase(data.RESTAURANTS)) {
                setTitle(data.RESTAURANTS);
                return data.getRestaurants();
            } else if(category.equalsIgnoreCase(data.MUSEUMS)) {
                setTitle(data.MUSEUMS);
                return data.getMuseums();
            } else if(category.equalsIgnoreCase(data.THEATERS)) {
                setTitle(data.THEATERS);
                return data.getTheaters();
            } else if(category.equalsIgnoreCase(data.ATTRACTIONS)) {
                setTitle(data.ATTRACTIONS);
                return data.getAttractions();
            } else {
                throw new IllegalArgumentException("Selected category is not valid.");
            }
        } else {
            throw new NullPointerException("Selected category is null.");
        }
    }
}
