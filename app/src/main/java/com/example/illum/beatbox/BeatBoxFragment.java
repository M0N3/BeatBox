package com.example.illum.beatbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by illum on 5/10/2017.
 */

public class BeatBoxFragment extends Fragment {
    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @BindView(R.id.fragment_beat_box_recycler_view)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beat_box, container,
                false);
        ButterKnife.bind(this, view);
        recyclerView.setLayoutManager(new GridLayoutManager
                (getActivity(), 3));
        recyclerView.setAdapter(new SoundAdapter());
        return view;
    }

    class SoundHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.list_item_sound_button)
        Button mButton;

        public SoundHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound, container, false));
            ButterKnife.bind(this, itemView);
        }
    }

    class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
        @Override
        public SoundHolder onCreateViewHolder
                (ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(SoundHolder soundHolder, int position) {
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
