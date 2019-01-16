package com.example.android.tokyo;

/**
 * {@link Spot} represents a spot that the user wants to discover.
 * It contains resource IDs for the name of the place, description and image file for that spot.
 */
public class Spot {

    /**
     * String resource ID for the name of the spot
     */
    private int mNameId;

    /**
     * String resource ID for the description of the spot
     */
    private int mDescriptionId;

    /**
     * Image resource ID for the spot
     */
    private int mImageResourceId;

    /**
     * Create a new Spot object.
     *
     * @param nameId          is the string resource ID for the spot name
     * @param descriptionId   is the string resource Id for the spot description
     * @param imageResourceId is the resource ID for image file associated with this spot
     */
    public Spot(int nameId, int descriptionId, int imageResourceId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID of the name of the spot.
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID of the description of the spot.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID of the spot.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
