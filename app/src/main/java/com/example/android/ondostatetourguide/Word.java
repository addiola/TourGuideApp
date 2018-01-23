package com.example.android.ondostatetourguide;

import java.util.ArrayList;

/**
 * Created by Addi_ola on 29/11/2017.
 */

public class Word extends ArrayList<Word> {
    //name of Attraction
    private String mName;

    //rating of attraction
    private String mRating;

    private String mContactInfo;

    /**
     * Image for visual understanding of word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //Default Constructor
    public Word(String name, String rating, String contactInfo, int imageResourceId) {
        mName = name;
        mRating = rating;
        mContactInfo = contactInfo;
        mImageResourceId = imageResourceId;
    }

    //get name
    public String getName() {
        return mName;
    }

    //get rating
    public String getRating() {
        return mRating;
    }

    public String getContactInfo() {
        return mContactInfo;
    }

    /**
     * Get the image
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
