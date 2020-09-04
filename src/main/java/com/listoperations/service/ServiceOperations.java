package com.listoperations.service;

import com.listoperations.operations.DataOperations;
import com.listoperations.operations.ListOperations;
import java.util.List;

public class ServiceOperations {

    public ServiceOperations(){

    }

    public List<Double> sort(List<Double> list){
        ListOperations op = new ListOperations(list);
        op.sort();
        return list;
    }

    public DataOperations data(List<Double> list){
        ListOperations op = new ListOperations(list);
        return new DataOperations(op.sum(),op.average());

    }

}
