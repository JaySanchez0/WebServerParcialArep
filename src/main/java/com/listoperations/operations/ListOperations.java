package com.listoperations.operations;

import java.util.List;

public class ListOperations {
    private List<Double> elements;

    public  ListOperations(List<Double> elements){
        this.elements = elements;
    }

    public void sort(){
        if(elements.size()<=1) return;
        for(int j=0;j<elements.size();j++) {
            for (int i = 0; i < elements.size() - 1; i++) {
                if (elements.get(i + 1) < elements.get(i)) {
                    double a = elements.get(i);
                    double b = elements.get(i + 1);
                    elements.set(i, b);
                    elements.set(i + 1, a);
                }
            }
        }
    }

    public double sum(){
        double s = 0;
        for(double b: elements) s+=b;
        return s;
    }

    public double average(){
        if(elements.size()==0) return 0;
        double s = sum();
        return s/elements.size();
    }

}
