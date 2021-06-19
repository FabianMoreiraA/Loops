package uh.ac.cr;

public class InteractiveControl {
    //Metodo WHILE

    public void mientras(int num){
        int i = 0;
        while (i < num){
            System.out.println("Hello World");
            i = i+1;
        }
    }

    public void para(int num){

        for (int i=1; i<=num; i++){
            System.out.println("Hello Planet");
        }
    }

    public void make(int num3){
        int i=0;
        do {
            System.out.println("Hello Amazing World with Do While");
            i=i+1;
        } while (i<num3);
    }

}
