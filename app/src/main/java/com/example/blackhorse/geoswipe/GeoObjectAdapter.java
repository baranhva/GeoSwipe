package com.example.blackhorse.geoswipe;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class GeoObjectAdapter extends RecyclerView.Adapter<GeoObjectViewHolder>  {

    public List<GeoObject> listGeoObject;

    public GeoObjectAdapter(List<GeoObject> listGeoObject) {
        this.listGeoObject = listGeoObject;
    }
    @Override
    public GeoObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main, parent, false);
        return new GeoObjectViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final GeoObjectViewHolder holder, final int position) {
        // Gets a single item in the list from its position
        final GeoObject geoObject = listGeoObject.get(position);
        // The holder argument is used to reference the views inside the viewHolder
        // Populate the views with the data from the list
        holder.geoImage.setImageResource(geoObject.getmGeoImageName());
    }
    @Override
    public int getItemCount() {
        return listGeoObject.size();
    }
}