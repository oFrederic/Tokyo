package com.example.android.tokyo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment that displays "Roppongi".
 */
public class RoppongiFragment extends Fragment implements View.OnClickListener {


    public RoppongiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inputFragmentView = inflater.inflate(R.layout.fragment_roppongi, container, false);

        TextView roppongiRestaurant = inputFragmentView.findViewById(R.id.roppongi_restaurant_textView);
        roppongiRestaurant.setOnClickListener(this);
        TextView roppongiShopping = inputFragmentView.findViewById(R.id.roppongi_shopping_textView);
        roppongiShopping.setOnClickListener(this);
        TextView roppongiActivity = inputFragmentView.findViewById(R.id.roppongi_activity_textView);
        roppongiActivity.setOnClickListener(this);
        TextView roppongiHotel = inputFragmentView.findViewById(R.id.roppongi_hotel_textView);
        roppongiHotel.setOnClickListener(this);

        return inputFragmentView;
    }

    /**
     *Override method from the View.onClickListener that setup an onClickListener for Multiple Buttons.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.roppongi_restaurant_textView:
                Toast.makeText(getActivity(), getString(R.string.roppongi_restaurant_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.roppongi_shopping_textView:
                Toast.makeText(getActivity(), getString(R.string.roppongi_shopping_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.roppongi_activity_textView:
                Toast.makeText(getActivity(), getString(R.string.roppongi_activity_toast),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.roppongi_hotel_textView:
                Toast.makeText(getActivity(), getString(R.string.roppongi_hotel_toast),
                        Toast.LENGTH_SHORT).show();
                break;

        }
    }
}