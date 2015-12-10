package com.example.admin.mycalculator;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import java.util.Stack;

public abstract class AbstractDisplay{
    //数値の桁数
    protected final int DISPLAY_DIGIT = 12;
    //ディスプレイに表示される文字をスタックで保持
    protected final Stack<String> displayChar = new Stack<String>();
    //Trueの場合カンマ表示中（少数点入力モード）である
    protected boolean commaMode;
    //小数点以下の桁数を保持
    protected int decimalPlaces;
    //マイナス記号
    protected boolean minus;
    //
    protected TextView view;

    //ディスプレイ表示を行う
    public abstract void showDisplay(boolean format);

    //押されたボタンに合わせて内部の値を遷移
    public abstract void onInputNumber(Number num);

    //ディスプレイの内容をクリアする
    public abstract void clear();

    //ディスプレイの内容をdouble型で取得
    public abstract double getNumber();

    //引数の数字を文字列にしてディスプレイに設定する。
    public abstract void setNumber(double d);

   public String toString() {
       return displayChar.toString();
   }
}
