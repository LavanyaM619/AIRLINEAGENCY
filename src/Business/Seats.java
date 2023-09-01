/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author vennelareddy
 */
public class Seats {
   ArrayList<String> seat;
    
    public Seats(){
    seat = new ArrayList<String>();    
    seat.add("1A");
    seat.add("2A");
    seat.add("3A");
    seat.add("4A");
    seat.add("5A");
    
    seat.add("1B");
    seat.add("2B");
    seat.add("3B");
    seat.add("4B");
    seat.add("5B");
    
    seat.add("1C");
    seat.add("2C");
    seat.add("3C");
    seat.add("4C");
    seat.add("5C");
    }

    public ArrayList<String> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<String> seat) {
        this.seat = seat;
    }
}
