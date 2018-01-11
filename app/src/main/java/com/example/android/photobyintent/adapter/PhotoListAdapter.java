package com.example.android.photobyintent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.photobyintent.R;
import com.example.android.photobyintent.bean.PhotoPicRecord;

import java.util.ArrayList;


/**
 * Created by Manuel on 11/27/2014.
 */
public class PhotoListAdapter extends ArrayAdapter<PhotoPicRecord> {

    private Context context;
    private ArrayList<PhotoPicRecord> items;
    private LayoutInflater vi;

    public PhotoListAdapter(Context context,ArrayList<PhotoPicRecord> items) {
        super(context,0, items);
        this.context = context;
        this.items = items;
        vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        final PhotoPicRecord pli = items.get(position);
        if (pli != null) {
            //if(i.isProductItem()){
                v = vi.inflate(R.layout.photo_view_list, null);

                final ImageView imageView = (ImageView) v.findViewById(R.id.ivPhotoPic);
                final TextView txTimestamp = (TextView) v.findViewById(R.id.txTimestamp);

                imageView.setImageBitmap(pli.getmPhotoPic());
                txTimestamp.setText(pli.getTimestamp());
                //productName.setText(Util.formatTextCapitalizeFirstLetterOfWords(pli.getProduct().getDescription()));
                //quantity.setText(Integer.toString(pli.getQuantity()));
                //price.setText(Util.formatAmount(pli.getPrice())+" Gs.");
            //}
        }

        return v;
    }

}
