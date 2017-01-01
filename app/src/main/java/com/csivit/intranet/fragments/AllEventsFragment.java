package com.csivit.intranet.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csivit.intranet.R;
import com.csivit.intranet.utils.Data;
import com.csivit.intranet.utils.EventViewHolder;

public class AllEventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_list, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new EventViewHolder(inflater.inflate(R.layout.event_list_item, parent, false));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                EventViewHolder viewHolder = (EventViewHolder) holder;
                viewHolder.title.setText(Data.AllEvents.get(position).title);
                viewHolder.organisedBy.setText(Data.AllEvents.get(position).organisedBy);
            }

            @Override
            public int getItemCount() {
                return Data.AllEvents.size();
            }
        });
        return rootView;
    }
}
