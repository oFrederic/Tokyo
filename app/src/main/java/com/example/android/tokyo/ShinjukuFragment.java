package com.example.android.tokyo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment that displays "Shinjuku".
 */
public class ShinjukuFragment extends Fragment implements View.OnClickListener {


    public ShinjukuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inputFragmentView = inflater.inflate(R.layout.fragment_shinjuku, container, false);

        TextView shinjukuRestaurant = inputFragmentView.findViewById(R.id.shinjuku_restaurant_textView);
        shinjukuRestaurant.setOnClickListener(this);
        TextView shinjukuShopping = inputFragmentView.findViewById(R.id.shinjuku_shopping_textView);
        shinjukuShopping.setOnClickListener(this);
        TextView shinjukuActivity = inputFragmentView.findViewById(R.id.shinjuku_activity_textView);
        shinjukuActivity.setOnClickListener(this);
        TextView shinjukuHotel = inputFragmentView.findViewById(R.id.shinjuku_hotel_textView);
        shinjukuHotel.setOnClickListener(this);

        return inputFragmentView;
    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.shinjuku_restaurant_textView:
                Intent shinjukuRestaurantIntent = new Intent(getActivity(), ShinjukuRestaurantActivity.class);
                startActivity(shinjukuRestaurantIntent);
                break;
            case R.id.shinjuku_shopping_textView:
                Toast.makeText(getActivity(), "List of Shinjuku's shopping show up!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.shinjuku_activity_textView:
                Toast.makeText(getActivity(), "List of Shinjuku's activity show up!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.shinjuku_hotel_textView:
                Toast.makeText(getActivity(), "List of Shinjuku's hotel show up!",
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
