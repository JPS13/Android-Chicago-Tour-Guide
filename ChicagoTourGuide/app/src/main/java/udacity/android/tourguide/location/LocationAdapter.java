package udacity.android.tourguide.location;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import udacity.android.tourguide.R;

/**
 * This class extends the ArrayAdapter class to allow the
 * view to to be customized for Location objects.
 *
 * @author Joseph Stewart
 * @version 2.0
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /** Constructor */
    public LocationAdapter(Activity context, List<Location> locationList) {
        super(context, 0, locationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Location object located at this position in the list
        final Location currentLocation = getItem(position);

        // The TextView for the item's title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentLocation.getLocationTitle());

        // The TextView for the item's address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddress());

        // Find the ImageView for the item
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.item_image);

        // Make sure the item has an image
        if(currentLocation.hasImage()) {
            iconView.setImageResource(currentLocation.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        // Find the ImageView for the internet icon
        ImageView internetIcon = (ImageView) listItemView.findViewById(R.id.internet_icon);

        // Make sure the item has a website
        if(currentLocation.getWebsite() != null) {
            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = validateUri(currentLocation.getWebsite());
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    getContext().startActivity(intent);
                }
            });

            internetIcon.setVisibility(View.VISIBLE);
        } else {
            internetIcon.setVisibility(View.GONE);
        }

        return listItemView;
    }

    /**
     * This method validates the website for the Location object
     * and returns a Uri object.
     *
     * @param website The location's website.
     * @return The Uri object.
     */
    private Uri validateUri(String website) {
        if(website == null) {
            return null;
        } else {
            if(!website.startsWith("http://") || !website.startsWith("https://")) {
                website = "http://" + website;
            }
        }
        return Uri.parse(website);
    }
}
