package com.example.android.tokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment that displays "Ueno".
 */
public class UenoFragment extends Fragment implements View.OnClickListener {


    public UenoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inputFragmentView = inflater.inflate(R.layout.fragment_ueno, container, false);

        TextView uenoRestaurant = inputFragmentView.findViewById(R.id.ueno_restaurant_textView);
        uenoRestaurant.setOnClickListener(this);
        TextView uenoShopping = inputFragmentView.findViewById(R.id.ueno_shopping_textView);
        uenoShopping.setOnClickListener(this);
        TextView uenoActivity = inputFragmentView.findViewById(R.id.ueno_activity_textView);
        uenoActivity.setOnClickListener(this);
        TextView uenoHotel = inputFragmentView.findViewById(R.id.ueno_hotel_textView);
        uenoHotel.setOnClickListener(this);

        return inputFragmentView;
    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.ueno_restaurant_textView:
                Toast.makeText(getActivity(), getString(R.string.ueno_restaurant_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.ueno_shopping_textView:
                Toast.makeText(getActivity(), getString(R.string.ueno_shopping_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.ueno_activity_textView:
                Toast.makeText(getActivity(), getString(R.string.ueno_activity_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.ueno_hotel_textView:
                Toast.makeText(getActivity(), getString(R.string.ueno_hotel_toast),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}