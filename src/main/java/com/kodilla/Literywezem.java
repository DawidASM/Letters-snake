import java.util.*;
import java.lang.*;
import java.io.*;

class Division {

    ArrayList<String> listEven;
    ArrayList<String> listOdd;

    public Division(){
        listEven = new ArrayList<String>();
        listOdd = new ArrayList<String>();
    }


    public void divideList(ArrayDeque<String> divide){


        for( int n = 0 ; n < 50; n++){
            String object = divide.poll();

            if ( object.length() % 2 == 0 ){
                listEven.add(object);
            } else {
                listOdd.add(object);
            }
        }

        System.out.println("Even elements: " + listEven + " size: " + listEven.size());
        System.out.println("Odd elements: " + listOdd + " size: " + listOdd.size());
    }

}

class Create {
    public static void main (String[] args) {



        ArrayDeque<String> theList = new ArrayDeque<>();

        Random generator = new Random();

        for(int n=0; n<50; n++) {
            int amount = generator.nextInt(50) + 1;

            String letter = "a";
            String multi = "";
            for( int i = 0; i < amount; i++) {

                multi += letter;
            }
            theList.offer(multi);
        }

        Division test = new Division();
        test.divideList(theList);


    }
}