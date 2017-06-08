import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Declare Variables
        String make;
        //String model;
        
        //Create scanner object to get input from user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input an American made car Make");
        make = input.next();
        make = make.toLowerCase();
        
        /*Testing make only
        System.out.println("Please input a model for that make");
        model =input.next();
        model = model.toLowerCase();
        */
        
        input.close(); //Close input to prevent memory leak
        
        //System.out.println(make + " and " + model);
        /* Testing make only
        if ((make.compareTo("oldsmobile")==0))
        {
        //Oldsmobile Models
            System.out.println("Oldsmobile"); //See which car make it is
          if ((model.compareTo("cutlass")==0))
          {
            System.out.println("Oldsmobile Cutlass");
          }
          else if ((model.compareTo("eighty-eight")==0|| model.compareTo("88") ==0))
          {
            System.out.println("Oldsmobile Eighty-eight");
          }
        
        }
        else if (make.compareTo("chrysler")==0)
        {
        //Chrysler Models
            System.out.println("Chrysler"); //See which car make it is
         if (model.compareTo("")==0)
          {
          
          }
          else if (model.compareTo("")==0)
          {
          
          }
        }
        else if (make.compareTo("chevrolet")==0)
        {
        //Chevrolet Models
            System.out.println("Chevrolet"); //See which car make it is
    
         if (model.compareTo("")==0)
          {
          
          }
          else if (model.compareTo("")==0)
          {
          
          }
        }
        else if (make.compareTo("pontiac")==0)
        {
        //Pontiac Models
            System.out.println("Pontiac"); //See which car make it is
         if (model.compareTo("")==0)
          {
          
          }
          else if (model.compareTo("")==0)
          {
          
          }
        }
        else if (make.compareTo("dodge")==0)
        {
        //Dodge Models
            System.out.println("Dodge"); //See which car make it is
         if (model.compareTo("")==0)
          {
          
          }
          else if (model.compareTo("")==0)
          {
          
          }
        }
        else if (make.compareTo("ford")==0)
        {
        //Ford Models
            System.out.println("Ford"); //See which car make it is
         if (model.compareTo("")==0)
          {
          
          }
          else if (model.compareTo("")==0)
          {
          
          }
        }
      else 
      {
        System.out.println("I don't like that car, try again.");
      }
      */
        
        //Switch Statement
        
        switch (make) 
        {
        case "oldsmobile": 
            //oldsmobile stuff
            System.out.println("Oldsmobile switch");
            break;
        case "chrysler":
            //Chrysler stuff
            System.out.println("Chrysler switch");
            break;
            
        case "chevrolet":
            //Chevrolet stuff
            System.out.println("Chevrolet switch");
            break;
        case "dodge":
            //Dodge stuff
            System.out.println("Dodge switch");
            break;
            
        case "ford":
            //Ford Stuff
            System.out.println("Ford switch");
            break;
            
        case "pontiac":
            //Pontiac Stuff
            System.out.println("Pontiac Switch");
            break;
            
            default:
                System.out.println("I don't like that car, try again.");
                break;
        }
        System.exit(0);
       
    }

}