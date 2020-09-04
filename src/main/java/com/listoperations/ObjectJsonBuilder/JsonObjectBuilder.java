package com.listoperations.ObjectJsonBuilder;

import java.lang.reflect.Field;

public class JsonObjectBuilder {
    /**
     *
     * @param ob objeto a transformar
     * @return version json del objeto
     */
    public static String json(Object ob){
        String js = "{";
        for(Field f: ob.getClass().getDeclaredFields()){
            f.setAccessible(true);
            try {
                String fil = "\"" + f.getName() + "\":" + f.get(ob);
                js = js+fil+",";
            }catch(Exception e){

            }
        }
        return js.substring(0,js.length()-1)+"}";
    }

}
