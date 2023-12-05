import java .util.*;
public class projectclass_X_INFOTAINMENT 
{
    public static void main(String[] args)
    {
    
        Scanner ob=new Scanner (System.in);
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~BOREDOM BUSTERS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("        ****************** INFOTAINMENT LIST*******************      ");
        System.out.println("                  COSMOS --------> 1                               ");
        System.out.println("                  ATLAS  --------> 2                       ");  
        System.out.println("!!ENTER CHOICE!!");
        int ch=ob.nextInt();
        switch(ch)
        {
            case(1):
            System.out.println("THANK YOU! FOR CHOOSING THIS TOPIC");
            System.out.println();
            System.out.println("^^^^^^^^ MENU ^^^^^^");

            System.out.println("1.space trivia");
            System.out.println("2.space calculations");
            System.out.println("!!enter choice!!");
            int cr=ob.nextInt();
            switch(cr)
            {                
                case(1):
                int ans;
                System.out.println("WELCOME TO SPACE AND TECHNOLOGY QUIZ!!!");
                System.out.println("----------------------------------------------------");
                System.out.println("******YOUR FIRST THREE WRONG CHOICES WILL BE ACCEPTED*****");
                System.out.println("******THEN AFTER  IT YOU CAN'T CONTINUE PLAYING THE QUIZ*****");
                for(int S=1;S<=3;S++)
                {
                    System.out.println("------------------------------------------------");
                }   

                System.out.println("!!! NOW LETS START THE SPACE AND TECHNOLOGY QUIZ !!!"); 
                System.out.println("-----------------------------------------------------");
                for(int i=1;i<=10;i++)
                {
                    if(i==1)
                    {
                        System.out.println("YOUR FIRST QUESTION IS");
                        System.out.println(" NATIONAL AERONAUTIC SPACE ASSOCIATION IS SITUATED IN WHICH COUNTRY");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)RUSSIA      (2)INDIA");
                        System.out.println("     (3)CHINA       (4)U.S. OF AMERICA");
                        System.out.println();

                        ans=ob.nextInt();

                        if(ans==1)
                        {
                            System.out.println(" your answer is wrong,better luck next time ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong,better luck next time ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong ,better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                    }
                    if(i==2)
                    {
                        System.out.println("YOUR SECOND QUESTION IS");
                        System.out.println("WHAT IS THE FULL FORM OF ISRO ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)INDIAN SPACE AND RESEARCH ORGANISATION (2)INTERNATIONAL SPACE AND RESEARCH ORGANISATION ");
                        System.out.println("     (3)INDIA'S SPACE RESEARCH ORGANISATION    (4) NONE OF THEM");

                        ans=ob.nextInt();
                        if(ans==1)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }

                        if(ans==2)
                        {
                            System.out.println("your answer is wrong ,better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong ,better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong ,better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                    }
                    if(i==3)
                    {
                        System.out.println("YOUR THIRD QUESTION IS");
                        System.out.println("WHICH PLANET APART FROM VENUS ROTATE EAST TO WEST?");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)MARS     (2)EARTH");
                        System.out.println("     (3)SATURN   (4)URANUS");

                        ans=ob.nextInt();
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {

                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                    }
                    if(i==4)
                    {
                        System.out.println("YOUR FOURTH QUESTION IS");
                        System.out.println(" THE FIRST FRENCH SPACE SATELLITE WAS NAMED AFTER A CARTOON CHARACTER. NAME THE CHARACTER.    ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1) POPEYE     (2) PHOENIX");
                        System.out.println("     (3) ASTERIX    (4) SONIC ");

                        ans=ob.nextInt();
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                            break;
                        }
                        if(ans==3)
                        {

                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------"); 
                        }
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }
                    if(i==5)
                    {
                        System.out.println("YOUR FIFTH QUESTION IS");
                        System.out.println("   WHICH IS THE CLOSEST STAR TO EARTH IN SPACER?");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("    (1) SUN  (2) NEBULLA");
                        System.out.println("    (3) MOON (4) MARS");

                        ans=ob.nextInt();
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==3)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }
                    if(i==6)
                    {
                        System.out.println("YOUR SIXTH QUESTION IS");
                        System.out.println("WHICH AMONG THESE IS NOT A SPACE WALKER");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1) ED WHITE     (2) KATHY SULIVAN");
                        System.out.println("     (3) ALEXEI LEONOV(4) SUNITA WILLIAMS ");

                        ans=ob.nextInt();
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==4)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }
                    if(i==7)
                    {
                        System.out.println("YOUR SEVENTH QUESTION IS");
                        System.out.println(" HOW MANY PEOPLE HAVE LANDED ON MOON ? ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)13     (2)12");
                        System.out.println("     (3)30     (4)1");
                        System.out.println();

                        ans=ob.nextInt();
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==2)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }
                    if(i==8)
                    {
                        System.out.println("YOUR EIGTH QUESTION IS");
                        System.out.println("HOW MANY MOONS ARE IN OUR SOLAR SYSTEM? ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)1  (2)ONE FOR EACH PLANET");
                        System.out.println("     (3)18           (4)181");
                        System.out.println();

                        ans=ob.nextInt();
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==4)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }
                    if(i==9)
                    {
                        System.out.println("YOUR NINTH QUESTION IS");
                        System.out.println("     NAME THE NASA'S MOST FAMOUS TELESCOPE? ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)HUBBLE SPACE TELESCOPE    (2)ARMSTRONF TELESCOPE");
                        System.out.println("     (3)FALCON x20                (4)KENNEDY TELESCOPE");
                        System.out.println();

                        ans=ob.nextInt();
                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==3)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                        if(ans==1)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");  break;
                        }
                    }

                    if(i==10)
                    {
                        System.out.println();  
                        System.out.println(); 

                        System.out.println("YOUR LAST QUESTION IS");
                        System.out.println("     WHO IS THE CHIEF OF NASA? ");
                        System.out.println("YOUR OPTIONS ARE-->");
                        System.out.println("     (1)BLAISE COMPAORE    (2)GILBERT GUILLUAME");
                        System.out.println("     (3JAMES FREDRICK      (4)SAM NUJOMA");
                        System.out.println();

                        ans=ob.nextInt();

                        if(ans==2)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==1)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==3)
                        {
                            System.out.println("CONGRATULATIONS!!! YOU HAVE WON ");                         
                            System.out.println("--------------------------------------------");
                        }
                        if(ans==4)
                        {
                            System.out.println("your answer is wrong  better luck next time");
                            System.out.println("--------------------------------------------");
                        }               
                    }
                }
                System.out.println("!!thank you for playing!!");
                System.out.println("DO YOU WANT TO CONTINUE ??");
                System.out.println("(1) yes     (2)no ");
                int chi=ob.nextInt();
                if(chi==1)
                  System.out.println("!!now lets play another one!!");
                if(chi==2)
                break;
                 
                 System.out.println(" This is a weight calculator in space");
                  System.out.println("-----------------------------------");
                case(2):
                System.out.println("enter your weight");
                int w=ob.nextInt();
                double m=w*1/6.0;
                System.out.println("your weight on moon is"+m);
                double e=w*0.38;
                System.out.println("your weight on mercury is"+e);
                double v=w*0.91;
                System.out.println("your weight on venus is"+v);
                double n=w*0.38;
                System.out.println("your weight on mars is"+n);
                double j=w*2.34;
                System.out.println("your weight on jupiter is"+j);
                double p=w*0.93;
                System.out.println("your weight on saturn is"+p);
                double f=w*0.92;
                System.out.println("your weight on uranus is"+f);
                double l=w*1.12;
                System.out.println("your weight on neptune  is"+l);
                System.out.println();
                System.out.println("I AM DAMN SURE THAT YOU DID'NT KNOW  ABOUT THE FACT ABOVE!!!");

                break;
                default:
                System.out.println (" wrong choice ");
            }

            break;
            case(2):
            System.out.println("+++++++++ MENU ++++++++");
            System.out.println("    1.WORLD CLOCK  ");
            System.out.println("    2.COUNTRY CAPITALS RAPID FIRE  ");
            System.out.println       ("!! enter choice !!");
            int ce=ob.nextInt();

            switch(ce)
            {
                case(1):

                System.out.println(" Do you want to know the time of different cities ? ");
                String  d1=" ";
                System.out.println();   
                System.out.println("---enter your city's name---");
                d1=ob.next(); 
                System.out.println("****************************");  
                System.out.println("-- enter the time of your city in 24 hours --");
                int hours=ob.nextInt();     
                System.out.println("****************************");  
                System.out.println("-- enter the time of your city in minutes --");
                int  min =ob.nextInt();                 
                System.out.println("****************************");  
                System.out.println("");

                System.out.println(" Time in your city "+d1+" is "+hours+":"+min);
                System.out.println("which city's time do you want to know ??");
                System.out.println("1 ABU DHABI ");
                System.out.println("2 NEW YORK ");
                System.out.println("3 LONDON ");
                System.out.println("4 TOKYO ");
                System.out.println("5 PARIS ");
                System.out.println("ENTER YOUR CHOICE ");

                int cho=ob.nextInt();
                System.out.println("");
                int tim1=0;
                int tim2=0;
                if(cho==1)
                {
                    hours=(hours*60)-60;
                    tim1=tim1+(hours/60);
                    min=min-30;
                    tim2=tim2+min;

                    System.out.println(" The Time in ABU DHABI is=="+tim1+":"+tim2);
                }

                if(cho==2)
                {
                    hours=(hours*60)-600;
                    tim1=tim1+(hours/60);
                    min=min-30;
                    tim2=tim2+min;
                    System.out.println(" The Time in NEW YORK is=="+tim1+":"+tim2);

                }
                if(cho==3)
                {
                    hours=(hours*60)-300;
                    tim1=tim1+(hours/60);
                    min=min-30;
                    tim2=tim2+min;
                    System.out.println(" The Time in lONDON is=="+tim1+":"+tim2);

                }
                if(cho==4)
                {
                    hours=(hours*60)+180;
                    tim1=tim1+(hours/60);
                    min=min+30;
                    tim2=tim2+min;
                    System.out.println("The Time in TOKYO is=="+tim1+":"+tim2);

                }
                if(cho==5)
                {
                    hours=(hours*60)-240;
                    tim1=tim1+(hours/60);
                    min=min-30;
                    tim2=tim2+min;

                    System.out.println(" The Time in PARIS is=="+tim1+":"+tim2);

                }

                break;
                case(2):
                System.out.println("---TIME TO TEST YOUR ATLAS IQ---");
                System.out.println("*************************************");
                System.out.println("~~~SO BASICALLY I WILL ASK YOU DIRECT QUESTIONS FROM THE COUNTRIES OF ASIA,EUROPE,NORTH and SOUTH AMERICA~~~");
                System.out.println("***");   
                System.out.println("***"); 
                System.out.println("***"); 
                String ans="";
                for(int j=1;j<=11;j++)
                {
                    if(j==1)
                    {  
                        System.out.println("!!!!!!!! Here we go !!!!!!!"); 
                        System.out.println(); 
                        if(j==2)
                        {  
                            System.out.println("Q1 What is the capital of China?");
                            ans=ob.nextLine();String s2="Beijing";
                            int u=ans.compareToIgnoreCase(s2);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==3)
                        {  
                            System.out.println("Q2 What is the capital of France?");
                            ans=ob.nextLine();String s3="Paris";
                            int u=ans.compareToIgnoreCase(s3);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==4)
                        {  
                            System.out.println("Q3 What is the capital of Canada?");
                            ans=ob.nextLine();String s4="Ottawa";
                            int u=ans.compareToIgnoreCase(s4);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==5)
                        {  
                            System.out.println("Q4 What is the capital of Austria?");
                            ans=ob.nextLine();String s5="Vienna";
                            int u=ans.compareToIgnoreCase(s5);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==6)
                        {  
                            System.out.println("Q5 What is the capital of Poland?");
                            ans=ob.nextLine();String s6="Warsaw";
                            int u=ans.compareToIgnoreCase(s6);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==7)
                        {  
                            System.out.println("Q6 What is the capital of Azerbaijan?");
                            ans=ob.nextLine();String s7="Baku";
                            int u=ans.compareToIgnoreCase(s7);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==8)
                        {  
                            System.out.println("Q7 What is the capital of Jamaica?");
                            ans=ob.nextLine();String s8="Kingston";
                            int u=ans.compareToIgnoreCase(s8);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==9)
                        {  
                            System.out.println("Q8 What is the capital of Cuba?");
                            ans=ob.nextLine();String s9="Havana";
                            int u=ans.compareToIgnoreCase(s9);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        System.out.println(); 
                        if(j==10)
                        {  
                            System.out.println("Q9 What is the capital of Argentina?");
                            ans=ob.nextLine();String s10="Bueonos Aries";
                            int u=ans.compareToIgnoreCase(s10);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else  
                                System.out.println("your answer is wrong  better luck next time");
                        }
                        if(j==11)
                        {
                            System.out.println("Q10 What is the capital of India?");                                         
                            ans=ob.nextLine();  
                            String s1="New Delhi";
                            int u=ans.compareToIgnoreCase(s1);
                            if(u==0)

                                System.out.println("CONGRATULATIONS!!! YOU HAVE GOT THE CORRECT ANSWER ");
                            else
                                System.out.println("your answer is wrong  better luck next time ");
                        }
                    }
                }
                break;
                default:
                System.out.println("wrong choice");
            }
            break;

            default:
            System.out.println("wrong choice");
        }
    }

}
