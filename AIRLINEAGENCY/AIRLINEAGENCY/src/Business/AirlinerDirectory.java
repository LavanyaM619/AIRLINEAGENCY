/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author medas
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDir;

    public AirlinerDirectory() {
        airlinerDir = new ArrayList();
        mockAirliners();
    }

    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(ArrayList<Airliner> airlinerDir) {
        this.airlinerDir = airlinerDir;
    }
    
    public void addAirliner(Airliner a){
        airlinerDir.add(a);
        //System.out.println(a);
    }
    
    public void removeAirliner(Airliner a){
        airlinerDir.remove(a);
    }
    
    public void mockAirliners(){
        String[][] arr = {  {"British Airways","BA","100","50","England"},
                            {"American Airways","AA","100","60","America"},
                            {"Jet Airways","BA","100","30","India"},
                            {"Indian Airways","BA","100","40","India"},
                            {"Chineese Airways","BA","100","70","China"},
                            {"Aerlingus Airways","BA","100","20","Ireland"}
                         };
        
        for(int i=0;i<arr.length;i++) {
            Airliner temp = new Airliner();
            
            temp.setName(arr[i][0]);
            temp.setAirlineCode(arr[i][1]);
            temp.setNumOfFlights((int)Double.parseDouble(arr[i][2]));
            temp.setCountriesOperated((int)Double.parseDouble(arr[i][3]));
            temp.setOriginCountry(arr[i][4]);
            
            airlinerDir.add(temp);
        }
        
    }
    
}
