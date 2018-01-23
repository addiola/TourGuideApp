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
public class SiteSeeingFragment extends Fragment {


    public SiteSeeingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();

        words.add(new Word(getString(R.string.site_deji_akure), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.site_deji_of_akure));
        words.add(new Word(getString(R.string.site_idanre), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.sites_idanre_hills));
        words.add(new Word(getString(R.string.site_caves_ashes), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.sites_cave_ashes));
        words.add(new Word(getString(R.string.site_igbo), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.sites_igbo_olodumare));
        words.add(new Word(getString(R.string.site_ebomi), getString(R.string.rating_5), getString(R.string.event_contact_info), R.drawable.sites_ebomi_lake));


        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }

}
