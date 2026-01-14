package org.cfs;
public class Car {
    Engine engine;
    public void drive(){
        int start = engine.start();
        if(start >= 1){
            System.out.println("lets start the engine " + start);
        }else{
            System.out.println("lets not start the engine " + start);
        }
    }

    public Car(){
        System.out.println("car constructor");
    }

    public void setEngine(Engine engine) {
        System.out.println("set engine method");
        this.engine = engine;
    }
}
