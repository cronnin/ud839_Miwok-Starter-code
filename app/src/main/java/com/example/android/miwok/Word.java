package com.example.android.miwok;

/**
 * Created by Marcelo on 08/05/2017.
 */

public class Word {



    private String miwokText;
    private String defaultText;

    public Word(String mText, String dText){
        defaultText = dText;
        miwokText = mText;
    }

    public String getMiwokText() {
        return miwokText;
    }

    public String getDefaultText() {
        return defaultText;
    }
}
