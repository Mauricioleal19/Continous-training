package co.com.challenger.starsharp.interactions;

public class RandomNumber {

    public int name(){
        int randomNumber;
            randomNumber = (int)(Math.random()*10000);

        return randomNumber;
    }
public static void main(String[] args){
        RandomNumber p = new RandomNumber();
    System.out.println(p.name());
}
    }

