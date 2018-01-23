package com.example.android.ondostatetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word(getString(R.string.restaurant_fingerlicking), getString(R.string.rating_5), getString(R.string.phone_fingerlicking), R.drawable.restaurant_fingerlicking));
        words.add(new Word(getString(R.string.restaurant_chicken), getString(R.string.rating_5), getString(R.string.phone_chicken), R.drawable.restaurant_chicken_republic));
        words.add(new Word(getString(R.string.restaurant_captain_cook), getString(R.string.rating_3), getString(R.string.phone_captain_cook), R.drawable.restaurant_captain_cook));
        words.add(new Word(getString(R.string.restaurant_tantalizers), getString(R.string.rating_2), getString(R.string.phone_tantalizers), R.drawable.restaurant_tantalizers));


        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }

}
