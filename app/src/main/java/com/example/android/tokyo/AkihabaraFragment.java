package com.example.android.tokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment that displays "Akihabara".
 */
public class AkihabaraFragment extends Fragment implements View.OnClickListener {


    public AkihabaraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inputFragmentView = inflater.inflate(R.layout.fragment_akihabara, container, false);

        TextView akihabaraRestaurant = inputFragmentView.findViewById(R.id.akihabara_restaurant_textView);
        akihabaraRestaurant.setOnClickListener(this);
        TextView akihabaraShopping = inputFragmentView.findViewById(R.id.akihabara_shopping_textView);
        akihabaraShopping.setOnClickListener(this);
        TextView akihabaraActivity = inputFragmentView.findViewById(R.id.akihabara_activity_textView);
        akihabaraActivity.setOnClickListener(this);
        TextView akihabaraHotel = inputFragmentView.findViewById(R.id.akihabara_hotel_textView);
        akihabaraHotel.setOnClickListener(this);

        return inputFragmentView;
    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.akihabara_restaurant_textView:
                Toast.makeText(getActivity(), getString(R.string.akihabara_restaurant_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.akihabara_shopping_textView:
                Toast.makeText(getActivity(), getString(R.string.akihabara_shopping_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.akihabara_activity_textView:
                Toast.makeText(getActivity(), getString(R.string.akihabara_activity_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.akihabara_hotel_textView:
                Toast.makeText(getActivity(), getString(R.string.akihabara_hotel_toast),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}