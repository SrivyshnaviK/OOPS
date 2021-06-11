package com.Vyshnavi.oopsDemo;

public class Mobile {
    private int modelNo;
    Mobile(){ modelNo=0;}
    Mobile(int modelNo){ this.modelNo=modelNo;}
    int getModelNo(){ return this.modelNo; }
    public void printDetails()
    {
        System.out.println("General Mobile!!\nModel Number:"+getModelNo());
    }
    public void addDesign(){
        System.out.println("Adding Design..!");
    }
    public void addDesign(String design){
        System.out.println("Adding Design..!"+design);
    }
}
