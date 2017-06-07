import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //Declare Variables
        String make;
        String model;
        
        //Create scanner object to get input from user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input an American made car Make");
        input.next();
        make=make.toLowerCase();
        
        System.out.println("Please input a model for that make");
        input.next();
        model=model.toLowerCase();
        
        input.close(); //Close input to prevent memory leak
        
        if (make.compareTo("oldsmobile")==0)
        {
        //Oldsmobile Models
<<<<<<< HEAD
          if (model.compareTo("cutlass")==0)
          {
            system.out.println("Oldsmobile Cutlass");
          }
          else if (model.compareTo("eighty-eight")==0|| model.compareTo("88") ==0)
          {
            system.out.println("Oldsmobile Eighty-eight");
=======
          if (model.compareTo("")==0)
          {
          
          }
          esle if (model.compareTo("")==0)
          {
          
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          }
        
        }
        else if (make.compareTo("chrysler")==0)
        {
        //Chrysler Models
         if (model.compareTo("")==0)
          {
          
          }
<<<<<<< HEAD
          else if (model.compareTo("")==0)
=======
          esle if (model.compareTo("")==0)
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          {
          
          }
        }
        else if (make.compareTo("chevrolet")==0)
        {
        //Chevrolet Models
    
         if (model.compareTo("")==0)
          {
          
          }
<<<<<<< HEAD
          else if (model.compareTo("")==0)
=======
          esle if (model.compareTo("")==0)
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          {
          
          }
        }
        else if (make.compareTo("pontiac")==0)
        {
        //Pontiac Models
         if (model.compareTo("")==0)
          {
          
          }
<<<<<<< HEAD
          else if (model.compareTo("")==0)
=======
          esle if (model.compareTo("")==0)
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          {
          
          }
        }
        else if (make.compareTo("dodge")==0)
        {
        //Dodge Models
         if (model.compareTo("")==0)
          {
          
          }
<<<<<<< HEAD
          else if (model.compareTo("")==0)
=======
          esle if (model.compareTo("")==0)
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          {
          
          }
        }
        else if (make.compareTo("ford")==0)
        {
        //Ford Models
         if (model.compareTo("")==0)
          {
          
          }
<<<<<<< HEAD
          else if (model.compareTo("")==0)
=======
          esle if (model.compareTo("")==0)
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
          {
          
          }
        }
<<<<<<< HEAD
      else 
      {
        system.out.println("I don't like that car, try again.");
      }
    }

}
=======
    }

}
>>>>>>> 7121907b60d4af9de11a44ceec96585fd055f2c7
