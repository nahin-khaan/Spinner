package com.example.spinnercustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    String[] countries;
    String[] populations;
    int[] flags;
    Context context;
    LayoutInflater layoutInflater;

    public CustomAdapter( Context context, int[] flags,String[] countries, String[] populations) {
        this.countries = countries;
        this.populations = populations;
        this.flags = flags;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        if(v==null)
        {
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v=layoutInflater.inflate(R.layout.view,null,false);
        }
        ImageView image=v.findViewById(R.id.imageId);
        image.setImageResource(flags[i]);
        TextView texts=v.findViewById(R.id.countryNameTextId);
        texts.setText(countries[i]);
        TextView ptext=v.findViewById(R.id.populationTextId);
        ptext.setText(populations[i]);
        return v;
    }
}
