package com.umesh.dpatterns.factory;

/**
 * Created by umesh_w on 8/16/2017.
 */
public class ShapeFactory {


    /**
     *
     * @param
     * @return
     */
    public Shape getShape(String type){

        if(type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(type.equalsIgnoreCase("triangle")){
            return new Triangle();
        }else{
            return null;
        }
    }
}
