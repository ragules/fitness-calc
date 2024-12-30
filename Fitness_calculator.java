import java.util.Scanner;

public class Main
{

    public static void main(String[] a) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to give personal info");
        System.out.println("Enter 2 to calculate Target Heart Rate zone and BMI");
        System.out.println("Enter 3 to work out plane");
        int s1=s.nextInt();
        
 switch(s1)
 {
        case 1:
            {
          System.out.println("Enter your name :");
          String st=s.nextLine();
          s.nextLine();
          System.out.println("Enter your age :");
          int age=s.nextInt();
          s.nextLine();
           System.out.println("Enter your year of birth :");
           String yr=s.nextLine();
           System.out.println("Name :"+st);
           System.out.println("Age :"+age);
           System.out.println("Year of birth :"+yr);
           System.out.println("Enter the password :");
           String pass=s.nextLine();
           System.out.println("the pass word is  :"+pass);
           break;
                
            }
         case 2:
            {
                double hrr,min,max,maxHr;
	            Scanner sc=new Scanner(System.in);
	            System.out.println("Enter your age");
	            int age=sc.nextInt();
	            System.out.println("Enter resting heart rate");
	            int rhr=sc.nextInt();	
	            System.out.println("Enter low end heart rate zone");
            	double minPer=sc.nextInt();
            	System.out.println("Enter high end heart rate zone");
            	double maxPer=sc.nextInt();
            	System.out.println("Choose gender :\n1.male\n2.female\n");
            	int g=sc.nextInt();
            	if(g==1)
            	{	
            	maxHr=206.9-(0.67*age);
            	hrr=(maxHr-rhr);
            	min=(hrr*(minPer/100))+rhr;
            	max=(hrr*(maxPer/100))+rhr;
            	System.out.println("Target Heart Rate zone is between "+min+" to "+max);
         	}
	else
	if(g==2)
	{
	maxHr=206-(0.88*age);
	hrr=(maxHr-rhr);
	min=hrr*(minPer/100)+rhr;
	max=hrr*(maxPer/100)+rhr;
	System.out.println("Target Heart Rate zone is between "+min+" to "+max);
	}
		
        System.out.print("Enter your weight(kg):");
        double w = s.nextDouble();
        System.out.printf("\n%s", "Enter you height(cm):");
        double h = s.nextDouble();
        h = h / 100;

        double BMI = w / (h * h);

        String b;

        if (BMI < 18.5)
        {
            System.out.println("less than 18.5");
            b = "Underweight";
        } 
        else if ((BMI) >= 18.5 || (BMI) <= 24.9)
        {
            System.out.println("between 18.5 and 24.9");
            b = "Normal";
        } 
        else if (BMI >= 25 || BMI <= 29.9)
        {
            System.out.println("between 25 and 29.9");
            b = "Overweight";
        }
        else
        {
            System.out.println("greater than 30");
            b = "Obese";
        }

       System.out.println("Your BMI is:" + BMI + "(" + b + ")");
        int steps;
    int steplen;
    float starttime;
    float endtime;
    int met;
    float weight;
    System.out.println("Enter the number of steps: ");
      steps=s.nextInt();
      System.out.println("Enter the step length: ");
      steplen=s.nextInt();
      System.out.println("Enter the starttime: ");
      starttime=s.nextFloat();
      System.out.println("Enter the endtime: ");
      endtime=s.nextFloat();
      System.out.println("Enter the MET: ");
      met=s.nextInt();
      System.out.println("Enter the weight: ");
      weight=s.nextFloat();
     
 
        int dis=steps*steplen;
        float dur=endtime-starttime;
        float pace=dur/dis;
        float cal=met*dur*weight;
        System.out.println("the distance travelled : "+dis);
        System.out.println("the duration : "+dur);
        System.out.println("the pace is : "+pace);
        System.out.println("the calories burned are : "+cal);
                   
                    break;
                }

 }
    }
}

    
    