package oopskunal.abstraction.interfaces;

public class MusicDashboard implements Media{
    
    @Override
    public void start(){
        System.out.println("Music started");
    }

    @Override
    public void stop(){
        System.out.println("Music stopped");
    }

}
