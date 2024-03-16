package in.com;

import java.util.Scanner;

public class Vehicle {
      public void vehicle_details(String v_band , int price , String model) {
    	  System.out.println("Vehicle Name : "+v_band+" , price : "+price+" , model : "+model);
      }
      public void vehicle_details(String v_band , int price , String model , String color) {
    	  System.out.print("Vehicle Name : "+v_band+" , price : "+price+" , model : "+model+ ", Color : "+color);
      }
      
//      public void get_detail (String v_band , int price , String model ) {
//    	  Scanner sc = new Scanner(System.in);
//    	  System.out.println("Enter a name : ");
//    	  v_band = sc.nextLine();
//    	  
//    	  System.out.println("Enter a price : ");
//    	  price = sc.nextInt();
//    	  
//    	  System.out.println("Enter model : ");
//    	  model = sc.nextLine();
//      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vehicle ve = new Vehicle();
     ve.vehicle_details("tata", 950000, "punch");
     ve.vehicle_details("tata", 950000, "punch" , "white");
    
	}

}
