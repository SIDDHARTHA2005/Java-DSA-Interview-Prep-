package oopskunal.abstraction.interfaces;

public class ElectricEngine implements Engine {
    
    @Override
    public void start(){
        System.out.println("Electric engine started");
    }

    @Override
    public void stop(){
        System.out.println("Electric engine stooped");
    }
    
    @Override
    public void accelerate(){
        System.out.println("Electric engine accelerating");
    }

}
