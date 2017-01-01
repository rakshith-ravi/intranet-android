package com.csivit.intranet.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.csivit.intranet.R;

public class EventViewHolder extends RecyclerView.ViewHolder{

    public TextView title;
    public TextView organisedBy;
    public ImageView icon;

    public EventViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        organisedBy = (TextView) itemView.findViewById(R.id.organised_by);
        icon = (ImageView) itemView.findViewById(R.id.icon);
    }
}
