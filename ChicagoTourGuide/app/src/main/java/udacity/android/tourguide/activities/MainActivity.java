package udacity.android.tourguide.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import udacity.android.tourguide.R;

/**
 * This is the main activity for the app which shows a list
 * of categories for the user to choose.The app then navigates
 * to the location activity for chosen category.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the OnClickListeners for each category TextView
        setOnClickListeners();
    }

    /**
     * This method sets the OnClickListener for each text view in the
     * main activity. The app navigates to the location activity when
     * it is clicked.
     */
    private void setOnClickListeners() {
        TextView hotelsTextView = (TextView) findViewById(R.id.hotels_text_view);
        hotelsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                intent.putExtra("locationCategory", getString(R.string.activity_hotels_label));
                startActivity(intent);
            }
        });

        TextView restaurantsTextView = (TextView) findViewById(R.id.restaurants_text_view);
        restaurantsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                intent.putExtra("locationCategory", getString(R.string.activity_restaurants_label));
                startActivity(intent);
            }
        });

        TextView museumsTextView = (TextView) findViewById(R.id.museums_text_view);
        museumsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                intent.putExtra("locationCategory", getString(R.string.activity_museums_label));
                startActivity(intent);
            }
        });

        TextView theatersTextView = (TextView) findViewById(R.id.theaters_text_view);
        theatersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                intent.putExtra("locationCategory", getString(R.string.activity_theaters_label));
                startActivity(intent);
            }
        });

        TextView attractionsTextView = (TextView) findViewById(R.id.attractions_text_view);
        attractionsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                intent.putExtra("locationCategory", getString(R.string.activity_attractions_label));
                startActivity(intent);
            }
        });
    }

}
