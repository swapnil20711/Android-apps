package com.swapnil.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageId;

    public Word(String DefaultTranslation, String MiwokTranslation, int Image) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageId = Image;
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
}
