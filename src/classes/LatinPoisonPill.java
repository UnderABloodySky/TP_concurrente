package classes;

public class LatinPoisonPill implements Runnable {

    public void run(){
        throw new LatinPoisonPillException();
    }
}
