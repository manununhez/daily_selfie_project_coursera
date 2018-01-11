package com.example.android.photobyintent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;


/**
 * Created by Manuel on 11/28/2014.
 */
public class PhotoPreviewIntent extends Activity {
    private Intent intent;
    private ImageView preview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_photo);


        intent = getIntent();
        byte[] bytes = intent.getByteArrayExtra("BMP");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        preview = (ImageView) findViewById(R.id.ivPreview);
        preview.setImageBitmap(bmp);


    }


}
