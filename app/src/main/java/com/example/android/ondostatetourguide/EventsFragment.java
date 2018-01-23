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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Make an arraylist of type Word object
        final ArrayList<Word> words = new ArrayList<>();

        //add Word objects to arraylist Word
        words.add(new Word(getString(R.string.event_title1), getString(R.string.rating_4), getString(R.string.event_contact_info), R.drawable.ncnd));
        words.add(new Word(getString(R.string.event_title2), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.event_ooni_speaks));
        words.add(new Word(getString(R.string.event_title3), getString(R.string.rating_3), getString(R.string.event_contact_info), R.drawable.event_pasuma));
        words.add(new Word(getString(R.string.event_title4), getString(R.string.rating_2), getString(R.string.event_contact_info), R.drawable.events_ugogo_masquerade));
        words.add(new Word(getString(R.string.event_title5), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.event_getup_charity));


        //make a WordAdapter object
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        //find listView
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //set adapter on listview
        listView.setAdapter(adapter);


        return rootView;

    }

}
