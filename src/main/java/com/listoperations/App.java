package com.listoperations;

import com.listoperations.ObjectJsonBuilder.JsonObjectBuilder;
import com.listoperations.jsonListBuilder.BuilderList;
import com.listoperations.operations.DataOperations;
import com.listoperations.service.ServiceOperations;

import java.util.ArrayList;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Controlador de operacion
     * @param args
     */
    public static void main( String[] args )
    {
        ServiceOperations service = new ServiceOperations();
        port(getPort());
        staticFileLocation("static");
        post("/sort",(request,response)-> {
            response.header("Content-Type","application/json");
            return BuilderList.json(service.sort(BuilderList.build(request.body())));
        });

        post("/dataOperation",(request,response)->{
            response.header("Content-Type","application/json");
            return JsonObjectBuilder.json(service.data(BuilderList.build(request.body())));
        });

    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 80;
    }
}
