/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author medas
 */
public class Airliner {
    
    private String name;
    private String airlineCode;
    private int numOfFlights;
    private int countriesOperated;
    private String originCountry;

    public int getCountriesOperated() {
        return countriesOperated;
    }

    public void setCountriesOperated(int countriesOperated) {
        this.countriesOperated = countriesOperated;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getNumOfFlights() {
        return numOfFlights;
    }

    public void setNumOfFlights(int numOfFlights) {
        this.numOfFlights = numOfFlights;
    }

//    public FlightDirectory getFlightDir() {
//        return flightDir;
//    }
//
//    public void setFlightDir(FlightDirectory flightDir) {
//        this.flightDir = flightDir;
//    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
