import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*//println and scanner data from user
        //hello word project
        String name;
        System.out.println("Can you please enter your name");
        Scanner scanDataFromUser = new Scanner(System.in);
        name=scanDataFromUser.nextLine();
        //System.out.println("bonjour"+name);
        System.out.println("thanks, your age is:"+name);*/

        /*//mathematical operation
        float x=2, y=4;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x*y);*/

        /*//increment decrement
        int x=2;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);*/

       /* // surface circle
        System.out.println("welcome to circle area calculator");
        System.out.println("please enter radius of the cercle");
        final float pi=3.14f;
        Integer r;
        float result;
        Scanner sc =new Scanner(System.in);
        r=sc.nextInt();
        result=r*r*pi;
        System.out.println("your area circle is:"+result);*/

        /*// scape sequence
        System.out.println("Hello \t world");
        System.out.println("Hello \nworld");
        System.out.println("Hello \rworld");
        System.out.println("Hello  \bworld");
        System.out.println("Hello \" world");
        System.out.println("Hello \' world");
        System.out.println("Hello \\ world");*/

       /* int arg[]=new int[2];
        System.out.println("veuillez entrer deux nombre");
        Scanner sc =new Scanner(System.in);
        arg[0]=sc.nextInt();
        arg[1]=sc.nextInt();
        int result;
        int rest;
        result=arg[0]/arg[1];
        rest =arg[0]%arg[1];
        System.out.println("le resultat est "+ result +" le reset est "+rest);*/

        //loop condition
        // if else
        /*System.out.println("Hello please enter yr degree");
        int studentDegree;
        Scanner sc = new Scanner(System.in);
        studentDegree=sc.nextInt();

        if (studentDegree<50){

            System.out.println("you are failed");
        } else if(studentDegree>=50 && studentDegree<60) {
            System.out.println("you are got ==>D");
        } else if (studentDegree>=60 && studentDegree <80){
            System.out.println("you are got ==>C");
        } else {
            System.out.println("you are got ==>A+");
        }*/

        // case

        /*System.out.println("Hello, in wish grade you are");
        int gradLevel;
        Scanner sc=new Scanner(System.in);
        gradLevel=sc.nextInt();
        switch (gradLevel){
            case 1:
                System.out.println("please enter your term");
                Scanner sc2 = new Scanner(System.in);
                int term;
                term=sc2.nextInt();
                switch (term){
                    case 1:
                        System.out.println("you can study english");
                        break;
                    case 2:
                        System.out.println("you can study french");
                        break;
                    default:
                        System.out.println("you can study java");
                }

                break;
            case 2:
                System.out.println("you can study OOP");
                break;
            default:
                System.out.println("please enter a valid number");
        }*/
        // for loop

        /*for (int i=0;i<10; i++){
            System.out.println("Hello World");
        }*/
        // pyramid loop
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}