package org.cfs;

public class PetrolEngine implements Engine{
    public PetrolEngine(){
        System.out.println("constructor PetrolEngine");
    }
    public int start() {
        return 2;
    }
}
