package com.example.admin.mycalculator;

public class Calc implements Context{
    private double A;
    private double B;
    private Operation op;
    protected State state;
    protected AnswerDisplay view;

    public Calc(){
        A = 0d;
        B = 0d;
        op = null;
        changeState(NumberAState.getInstance());
        view = new AnswerDisplay();
    }

    public String getResult(){
        return view.calcResult;
    }

    public void onButtonNumber(Number num){
        state.onInputNumber(this, num);
    }

    public void onButtonOp(Operation op){
        state.onInputOperation(this, op);
    }

    public void onButtonClear(){
        state.onInputClear(this);
    }

    public void onButtonAllClear(){
        state.onInputAllClear(this);
    }

    public void onButtonEquale(){
        state.onInputEquale(this);
    }

    @Override
    public void changeState(State state){
        this.state = state;
    }

    @Override
    public double doOperation(){
        double result = op.eval(A, B);
        showDisplay(result);
        return result;
    }

    @Override
    public void showDisplay() {
        view.showDisplay(false);
    }

    @Override
    public void showDisplay(double d) {
        view.setNumber(d);
        view.showDisplay(true);
    }

    @Override
    public void addDisplayNumber(Number num) {
        if(num == Number.ZERO || num == Number.DOUBLE_ZERO){
            if(view.displayChar.size() == 0 && !view.commaMode){
                view.showDisplay(false);
                return;
            }
        }

        if(num == Number.COMMA && !view.commaMode && view.displayChar.size() == 0){
            view.onInputNumber(Number.ZERO);
        }

        view.onInputNumber(num);
        view.showDisplay(false);
    }

    @Override
    public void saveDisplayNumberToA() {
        A = view.getNumber();
    }

    @Override
    public void saveDisplayNumberToB() {
        B = view.getNumber();
    }

    @Override
    public void clearA() {
        A = 0d;
    }

    @Override
    public void clearB() {
        B = 0d;
    }

    @Override
    public Operation getOp() {
        return op;
    }

    @Override
    public void setOp(Operation op) {
        this.op = op;
    }

    @Override
    public void clearDisplay() {
        view.clear();
        view.showDisplay(false);
    }

    @Override
    public void copyAtoB() {
        B = A;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getB() {
        return B;
    }
}
