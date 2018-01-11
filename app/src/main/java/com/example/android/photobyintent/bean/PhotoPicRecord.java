package com.example.android.photobyintent.bean;


import android.graphics.Bitmap;

/**
 * Created by Manuel on 11/27/2014.
 */
public class PhotoPicRecord {

    private String timestamp;
    private Bitmap mPhotoPic;

    public PhotoPicRecord(String timestamp, Bitmap mPhotoPic) {
        this.timestamp = timestamp;
        this.mPhotoPic = mPhotoPic;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Bitmap getmPhotoPic() {
        return mPhotoPic;
    }

    public void setmPhotoPic(Bitmap mPhotoPic) {
        this.mPhotoPic = mPhotoPic;
    }

    @Override
    public String toString() {
        return "PhotoPicRecord{" +
                "timestamp='" + timestamp + '\'' +
                ", mPhotoPic=" + mPhotoPic +
                '}';
    }
}
