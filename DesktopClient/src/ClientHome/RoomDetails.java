/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientHome;

/**
 *
 * @author Microsoft
 */
public class RoomDetails {
 
    private int floor, id;
    private int room;
    private int co2;
    private int smoke;
    private String status;
    
    public RoomDetails(int id,int floor ,int room,int co2,int smoke,String status){
        this.id=id;
        this.floor=floor;
        this.room=room;
        this.co2=co2;
        this.smoke=smoke;
        this.status=status;
        
    }
    
     public int getid(){
        return id;
    }
 
    public int getfloor(){
        return floor;
    }
      public int getroom(){
        return room;
    }
    
      public int getco2(){
        return co2;
    }
      
       public int getsmoke(){
        return smoke;
    }
     
          public String getstatus(){
        return status;
    }
      
      
}
