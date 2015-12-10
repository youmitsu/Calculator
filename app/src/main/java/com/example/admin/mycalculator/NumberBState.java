package com.example.admin.mycalculator;

public class NumberBState implements State{

    private static NumberBState singleton = new NumberBState();

    private NumberBState(){
    }

    public static State getInstance(){
        return singleton;
    }

    @Override
    public void onInputNumber(Context context, Number num) {
        context.addDisplayNumber(num);
    }

    @Override
    public void onInputOperation(Context context, Operation op) {
        context.saveDisplayNumberToB();
        context.doOperation();
        context.setOp(op);
        context.saveDisplayNumberToA();
        context.changeState(OperationState.getInstance());
    }

    @Override
    public void onInputEquale(Context context) {
        context.saveDisplayNumberToB();
        context.doOperation();
        context.changeState(ResultState.getInstance());
    }

    @Override
    public void onInputClear(Context context) {
        context.clearB();
        context.clearDisplay();
    }

    @Override
    public void onInputAllClear(Context context) {
        context.clearA();
        context.clearB();
        context.clearDisplay();

        context.changeState(NumberAState.getInstance());
    }
}
