package com.example.admin.mycalculator;



public enum Operation {
    PLUS  { double eval(double x, double y) { return x+y; } },
    MINUS  { double eval(double x, double y) { return x-y; } },
    TIMES  { double eval(double x, double y) { return x*y; } },
    DIVIDE  { double eval(double x, double y) { return x/y; } },
    PERCENT { double eval(double x,double y) {return  x%y;}};
    abstract double eval(double x, double y);
}
