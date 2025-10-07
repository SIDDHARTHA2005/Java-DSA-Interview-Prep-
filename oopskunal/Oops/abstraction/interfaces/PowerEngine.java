package oopskunal.abstraction.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start(){
        System.out.println("Power engine started");
    }

    @Override
    public void stop(){
        System.out.println("Power engine stooped");
    }

    @Override
    public void accelerate(){
        System.out.println("Power engine accelerating");
    }
    
}
