package com.swapnil.miwok;

import android.media.Image;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageId = NO_IMAGE_PROVIDED;

    public Word(String DefaultTranslation, String MiwokTranslation, int Image) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageId = Image;
    }
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    public int getImageId() {
        return mImageId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslationTranslation() {
        return mDefaultTranslation;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;

    }
}
