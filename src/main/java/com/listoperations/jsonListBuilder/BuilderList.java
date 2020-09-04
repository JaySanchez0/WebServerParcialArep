package com.listoperations.jsonListBuilder;

import com.listoperations.operations.ListOperations;

import java.util.ArrayList;
import java.util.List;

public class BuilderList {
    /**
     *
     * @param json representacion en json de una lista
     * @return lista de double
     */
    public static List<Double> build(String json){
        json = json.replace("[","");
        json = json.replace("]","");
        String[] elem = json.split(",");
        ArrayList<Double> numbers = new ArrayList<>();
        for(String s: elem){
            try {
                s = s.replace(" ", "");
                numbers.add(Double.parseDouble(s));
            }catch (Exception e){

            }
        }
        return numbers;
    }

    /**
     *
     * @param numbers lista de numeros
     * @return version json de la lista
     */
    public static String json(List<Double> numbers){
        String rep = "[";
        for(double n:numbers) rep = rep+n+",";
        return  rep.substring(0,rep.length()-1)+"]";
    }

}
