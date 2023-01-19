package co.com.challenger.starsharp.interactions;

public class RandomName {

    public String name(){
        int randomNumber;
            randomNumber = (int)(Math.random()*10000);

        return "Business unit "+randomNumber;
    }
public static void main(String[] args){
        RandomName p = new RandomName();
    System.out.println(p.name());
}
    }

