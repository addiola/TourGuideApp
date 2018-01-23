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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word(getString(R.string.hotel_amazon), getString(R.string.rating_2), getString(R.string.event_contact_info), R.drawable.hotels_amazon));
        words.add(new Word(getString(R.string.hotel_world_class), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.hotels_world_class));
        words.add(new Word(getString(R.string.hotel_crystal), getString(R.string.rating_3), getString(R.string.event_contact_info), R.drawable.hotels_crystal_suites));


        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }

}
