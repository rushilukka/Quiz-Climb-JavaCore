import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
import static java.lang.Math.min;

public class Main {


            static int correct1;
            static int correct2;
            static String CreateLine(int gno,int m){
                return gno+"       "+m+"\n";
            }
            static void inputData(String s1){
                try{
                    File file = new File("main.txt");
                    FileWriter fr = new FileWriter(file,true);
                    fr.write(s1);
                    fr.close();

                }
                catch(Exception e){
                    System.out.println(e);}
            }
            static void quiz(){
                Scanner s = new Scanner(System.in);
                int a;
                System.out.print("Enter GR no.(3 digit) : ");
                a=s.nextInt();

                int y = quiz_1();
                String s1 = CreateLine(a,y);//y -> marks
                inputData(s1);//to file
            }
            static int quiz_1(){
                Scanner s = new Scanner(System.in);

                correct1 = 0;
                int questions = 10;
                System.out.println ("Welcome to the Multiple Choice Quiz! \n");
                String[][]Ques_Ans1 ={//i=no.of question  j=0,question j=1,options,j=2,coreect answer

                        {"Which method can be used to find the length of a string in JAVA?",
                                "\n A. length() \n B. getlength() \n C. len \n D. getsize()\n","A"},

                        {"Which class is available to all the class automatically?",
                                "\n A. Swing \n B. Applet \n C. Object \n D. ActionEvent\n","C"},

                        {"Which package is directly available to our class without importing it?",
                                "\n A. Swing \n B. Applet \n C. net \n D. Lang\n","D"},

                        {"String class is defined in which package?",
                                "\n A. Lang \n B. Swing \n C. Applet \n D. awt\n","A"},

                        {"Which institute is best for java coaching?",
                                "\n A. Utek \n B. Aptech \n C. SSS IT \n D. jtek\n","C"},

                        {" Which one among these is not a keyword?",
                                "\n A. Class \n B. int \n C. get \n D. if\n","C"},

                        {"Which one among these is not a class?",
                                "\n A. Swing \n B. ActionPerformed \n C. ActionEvent\n D. Button\n","B"},

                        {"which one among these is not a function of Object class?",
                                "\n A. toString \n B. finalize \n C. equals \n D. getDocumentBase\n","D"},

                        {"which function is not present in Applet class?",
                                "\n A. init \n B. main \n C. start \n D. destroy\n","B"},

                        {"Which one among these is not a valid component?",
                                "\n A. JButton \n B. JList \n C. JBUttonGroup \n D. JTextArea\n","C"}
                };

                String[]user_ans1 = new String[(int) questions];
                int i = 0;
                do{
                    System.out.print((i + 1) + ". " + Ques_Ans1[i][0] + "   " +Ques_Ans1[i][1]);
                    System.out.print("Enter your Answer:");
                    user_ans1[i] = String.valueOf (s.next().charAt (0));
                    user_ans1[i]=user_ans1[i].toUpperCase();
                    if (Ques_Ans1[i][2].equals (user_ans1[i])){
                        System.out.println ("\nCorrect!");
                        correct1++;
                    }
                    else{
                        System.out.println ("\n Incorrect. The correct answer is " +Ques_Ans1[i][2]);
                    }
                    System.out.print ("\n");
                    i++;
                }
                while (i < questions);
                System.out.println ("\nYour Score in level 1 is: " + correct1);
                if(correct1 > 4){
                    System.out.println("\nCongratulations!!!!\nYou are eligible for level 2 quiz");
                    System.out.println("Do you want to Continue??\n1.Press 1 for continue\n2.Any other key for exit");
                    System.out.print("Enter your Choice: ");
                    int ch=s.nextInt();
                    switch(ch){
                        case 1:
                            correct2 = quiz_2();
                            int e = correct1 + correct2;
                            System.out.println("Total score : "+e);
                            return e;

                        default:
                            return correct1;
                    }
                }

                return correct1;
            }
            static int quiz_2(){
                Scanner s = new Scanner(System.in);
                int u = 0;
                int questions = 5;
                System.out.println ("Welcome to the Quiz-2 \n");
                String[][]Ques_Ans2 ={//i=no.of question  j=0,question j=1,options,j=2,coreect answer
                        {"What is the size of float variable? ",
                                "\n A. 8 bit \n B. 16 bit \n C. 32 bit \n D. 64 bit\n", "C"},

                        {"Which one of these is not a primitive data type? ",
                                "\n A. integer \n B. char \n C. float \n D. double\n", "B"},

                        {"Which data type is used to create a variable that should store text? ",
                                "\n A. myString \n B. string \n C. character \n D. String64\n","D"},

                        {"How do you create a variable with the numeric value 5? ",
                                "\n A. num x = 5; \n B. float x = 5; \n C. x = 5; \n D. int x = 5;\n","A"},

                        {"Which method can be used to find the length of a string in JAVA?",
                                "\n A. length() \n B. getlength() \n C. len \n D. getsize()\n","A"}};

                String[]user_ans2 = new String[(int) questions];
                int i = 0;
                do{
                    System.out.print ("" + (i + 1) + ". " + Ques_Ans2[i][0] + "   " +Ques_Ans2[i][1]);
                    System.out.print("Enter your Answer:");
                    user_ans2[i] = String.valueOf (s.next().charAt (0));
                    user_ans2[i]=user_ans2[i].toUpperCase();
                    if (Ques_Ans2[i][2].equals (user_ans2[i])){
                        System.out.println ("\n Correct!");
                        u++;
                    }
                    else{
                        System.out.println ("\n Incorrect. The correct answer is " +Ques_Ans2[i][2]);
                    }
                    System.out.print ("\n");
                    i++;
                }
                while (i < questions);
                return u;
            }
            static void search(){
                //get roll no getByRollNo
                int p =0;
                Scanner s = new Scanner(System.in);
                int a;
                System.out.print("Enter GR no.(3 digit) : ");
                a=s.nextInt();
                String x = Integer.toString(a);
                try{
                    File f1= new File("Main.txt");
                    FileReader fr = new FileReader(f1);
                    BufferedReader br=new BufferedReader(fr);

                    String l=null;
                    System.out.println("Previous Record/s : ");
                    System.out.println("GR no. | marks");
                    while((l=br.readLine()) !=null)
                    {   char r[] = new char[3];
                        r[0] =l.charAt(0); r[1] =l.charAt(1); r[2] =l.charAt(2);
                        char c[] = new char[3];
                        c[0] =x.charAt(0); c[1] =x.charAt(1); c[2] =x.charAt(2);
                        if(r[0] == c[0] && r[1] == c[1] && r[2] == c[2]){

                            System.out.println(l);
                            p=1;
                        }
                    }
                    if(p == 0){System.out.println("No record found ");}
                    br.close();
                }
                catch(Exception e){
                    System.out.println(e);;}

            }
            static void fetchAll(){
                try{
                    File f1= new File("Main.txt");
                    FileReader fr = new FileReader(f1);
                    BufferedReader br=new BufferedReader(fr);

                    String l=null;
                    System.out.println("GR no. | marks");
                    while((l=br.readLine()) !=null)
                    {      System.out.println(l);
                    }
                    br.close();
                }
                catch(Exception e){
                    System.out.println(e);;}

            }

            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int ch;

                System.out.println("-_-_-_-_-_ONLINE QUIZ GENERATOR_-_-_-_-_-\n");
                while(true){
                    System.out.println("--------------------------------");
                    System.out.println("1 to Conduct Quiz\n2 to search record");
                    System.out.println("3 to fetch all records\n4 to exit\n");
                    System.out.print("Enter choice :");
                    ch=s.nextInt();
                    switch(ch){
                        case 1: quiz();break;
                        case 2: search();break;
                        case 3: fetchAll();break;
                        case 4: System.exit(0);
                        default:System.out.println("Enter valid choice!!!\n");
                    }
                }
            }
        }






