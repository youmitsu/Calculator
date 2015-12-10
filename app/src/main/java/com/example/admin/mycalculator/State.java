package com.example.admin.mycalculator;

public interface State {

    public abstract void onInputNumber(Context context, Number num);

    public abstract void onInputOperation(Context context, Operation op);

    public abstract void onInputEquale(Context context);

    public abstract void onInputClear(Context context);

    public abstract void onInputAllClear(Context context);
}
