package com.example.android.tokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment that displays "Odaiba".
 */
public class OdaibaFragment extends Fragment implements View.OnClickListener {


    public OdaibaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inputFragmentView = inflater.inflate(R.layout.fragment_odaiba, container, false);

        TextView odaibaRestaurant = inputFragmentView.findViewById(R.id.odaiba_restaurant_textView);
        odaibaRestaurant.setOnClickListener(this);
        TextView odaibaShopping = inputFragmentView.findViewById(R.id.odaiba_shopping_textView);
        odaibaShopping.setOnClickListener(this);
        TextView odaibaActivity = inputFragmentView.findViewById(R.id.odaiba_activity_textView);
        odaibaActivity.setOnClickListener(this);
        TextView odaibaHotel = inputFragmentView.findViewById(R.id.odaiba_hotel_textView);
        odaibaHotel.setOnClickListener(this);

        return inputFragmentView;
    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.odaiba_restaurant_textView:
                Toast.makeText(getActivity(), getString(R.string.odaiba_restaurant_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.odaiba_shopping_textView:
                Toast.makeText(getActivity(), getString(R.string.odaiba_shopping_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.odaiba_activity_textView:
                Toast.makeText(getActivity(), getString(R.string.odaiba_activity_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.odaiba_hotel_textView:
                Toast.makeText(getActivity(), getString(R.string.odaiba_hotel_toast),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}