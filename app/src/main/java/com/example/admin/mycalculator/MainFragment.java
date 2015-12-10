package com.example.admin.mycalculator;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private View view;
    private TextView tv;
    private Calc calc;            //計算するためのクラス

    public MainFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //viewの生成？
        view = inflater.inflate(R.layout.fragment_main,container,false);
        calc = new Calc();

        View.OnClickListener key_0_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.ZERO);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_1_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.ONE);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_2_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.TWO);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_3_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.THREE);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_4_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.FOUR);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_5_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.FIVE);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_6_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.SIX);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_7_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.SEVEN);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_8_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.EIGHT);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_9_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.NINE);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_AC_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonAllClear();
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_Clear_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonClear();
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_percent_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonOp(Operation.PERCENT);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_division_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonOp(Operation.DIVIDE);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_times_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonOp(Operation.TIMES);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_minus_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonOp(Operation.MINUS);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_plus_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonOp(Operation.PLUS);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_dot_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonNumber(Number.COMMA);
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };View.OnClickListener key_equal_ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc.onButtonEquale();
                tv = (TextView) view.findViewById(R.id.form);
                tv.setText(calc.getResult());
            }
        };

        view.findViewById(R.id.key_0).setOnClickListener(key_0_ClickListener);
        view.findViewById(R.id.key_1).setOnClickListener(key_1_ClickListener);
        view.findViewById(R.id.key_2).setOnClickListener(key_2_ClickListener);
        view.findViewById(R.id.key_3).setOnClickListener(key_3_ClickListener);
        view.findViewById(R.id.key_4).setOnClickListener(key_4_ClickListener);
        view.findViewById(R.id.key_5).setOnClickListener(key_5_ClickListener);
        view.findViewById(R.id.key_6).setOnClickListener(key_6_ClickListener);
        view.findViewById(R.id.key_7).setOnClickListener(key_7_ClickListener);
        view.findViewById(R.id.key_8).setOnClickListener(key_8_ClickListener);
        view.findViewById(R.id.key_9).setOnClickListener(key_9_ClickListener);
        view.findViewById(R.id.key_ac).setOnClickListener(key_AC_ClickListener);
        view.findViewById(R.id.key_c).setOnClickListener(key_Clear_ClickListener);
        view.findViewById(R.id.key_division).setOnClickListener(key_division_ClickListener);
        view.findViewById(R.id.key_multiply).setOnClickListener(key_times_ClickListener);
        view.findViewById(R.id.key_minus).setOnClickListener(key_minus_ClickListener);
        view.findViewById(R.id.key_plus).setOnClickListener(key_plus_ClickListener);
        view.findViewById(R.id.key_dot).setOnClickListener(key_dot_ClickListener);
        view.findViewById(R.id.key_percent).setOnClickListener(key_percent_ClickListener);
        view.findViewById(R.id.key_equal).setOnClickListener(key_equal_ClickListener);

        tv = (TextView) view.findViewById(R.id.form);
        tv.setText(calc.getResult());

        return view;
    }

}
