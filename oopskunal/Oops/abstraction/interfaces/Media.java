package oopskunal.abstraction.interfaces;

public interface Media {

    static void display(){
        System.out.println("This is a media interface");
    }
    
    void start();
    void stop();

}
