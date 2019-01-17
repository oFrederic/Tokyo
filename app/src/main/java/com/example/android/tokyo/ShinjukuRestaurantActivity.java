package com.example.android.tokyo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShinjukuRestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spot_list);

        ArrayList<Spot> spots = new ArrayList<>();

        spots.add(new Spot(R.string.zanmai_name, R.string.zanmai_description,
                R.drawable.zanmaisushi));

        // Create an {@link SpotAdapter}, whose data source is a list of {@link Spot}s. The
        // adapter knows how to create list items for each item in the list.
        SpotAdapter adapter = new SpotAdapter(this, spots);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SpotAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Spot} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kiyomura.co.jp/shops/detail/22")));
                    break;
                }
            }
        });
    }
}
