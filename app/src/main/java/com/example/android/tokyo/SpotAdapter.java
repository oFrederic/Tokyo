package com.example.android.tokyo;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SpotAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Spot} objects.
 */
public class SpotAdapter extends ArrayAdapter<Spot> {

    /**
     * Create a new {@link SpotAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param spots   is the list of {@link Spot}s to be displayed.
     */
    public SpotAdapter(Context context, ArrayList<Spot> spots) {
        super(context, 0, spots);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Spot currentSpot = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the currentSpot object and set this text on
        // the name TextView.
        nameTextView.setText(currentSpot.getNameId());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the currentSpot object and set this text on
        // the description TextView.
        descriptionTextView.setText(currentSpot.getDescriptionId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentSpot.getImageResourceId());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
