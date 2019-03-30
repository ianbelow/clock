package com.a.clock.Views.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.a.clock.Presenters.StopwatchPresenter;
import com.a.clock.R;
import com.a.clock.Repositories.AlarmRepository.AlarmItem;
import com.a.clock.Repositories.TimeRepository.TimeItem;

import java.util.ArrayList;
import java.util.List;

public class StopwatchFragment extends Fragment implements com.a.clock.Interfaces.View {

    private Button startButton, resetButton, pauseButton;
    private TextView stopwatchTextView;
    private StopwatchPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new StopwatchPresenter();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_stopwatch, container, false);
        presenter.bindView(this);

        startButton = view.findViewById(R.id.stopwatch_start_button);
        resetButton = view.findViewById(R.id.stopwatch_reset_button);
        pauseButton = view.findViewById(R.id.stopwatch_pause_button);
        stopwatchTextView = view.findViewById(R.id.stopwatch_text_view);

        return view;
    }






    @Override
    public void setRecyclerView(ArrayList list1, ArrayList list2) {

    }

    @Override
    public void showDeleteDialog() {

    }

    @Override
    public void hideDeleteDialog() {

    }

    @Override
    public void setUpAlarmRecyclerViewAdapter(List<AlarmItem> all) {

    }

    @Override
    public void setUpTimeRecyclerViewAdapter(List<TimeItem> all) {

    }
}
