package com.example.doctorw.application;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class FirstlayoutActivity extends Activity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.bt1) void onBt1Click() {
        //TODO implement
    }

    @OnLongClick(R.id.bt1) boolean onBt1LongClick() {
        //TODO implement
        return true;
    }

    @OnClick(R.id.bt2) void onBt2Click() {
        //TODO implement
    }

    @OnLongClick(R.id.bt2) boolean onBt2LongClick() {
        //TODO implement
        return true;
    }

    @OnClick(R.id.bt3) void onBt3Click() {
        //TODO implement
    }

    @OnLongClick(R.id.bt3) boolean onBt3LongClick() {
        //TODO implement
        return true;
    }
}
