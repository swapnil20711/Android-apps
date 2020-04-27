package com.swapnil.miwok;

import android.media.Image;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mAudioId;

    public Word(String DefaultTranslation, String MiwokTranslation, int Image, int audioId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageId = Image;
        mAudioId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }


    public int getImageId() {
        return mImageId;
    }

    public int getAudioId() {
        return mAudioId;
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
