package com.example.blackhorse.geoswipe;

public class GeoObject {

    private int mGeoImageName;
    private boolean isEurope;

    public GeoObject(int position) {
        this.mGeoImageName = PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[position];
        this.isEurope = IN_EUROPE[position];
    }
    public int getmGeoImageName() {
        return mGeoImageName;
    }
    public boolean isEurope() {
        return isEurope;
    }

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {
            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };
        public static final boolean IN_EUROPE[] = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };
}