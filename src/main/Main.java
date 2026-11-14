
package main;


public class Main {

  
    public static void main(String[] args) {
     WorkshopRegistration registration = new WorkshopRegistration();
     
     try{
     System.out.println(" Registering ");
     registration.registerParticipant("Aya", 16);
     }catch(InvalidAgeException i){
     System.out.println(i.getMessage());
     }
    }
    
}
