package model;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Vinh 03/03/2025
 */
public class Destination extends BaseModel {

    private double tourEntryFee;
    private LocalTime tourOpeningHours;
    private LocalTime tourClosingHours;
    private ArrayList<String> tourServicesAvailable;

    public Destination(double tourEntryFee, LocalTime tourOpeningHours, LocalTime tourClosingHours, ArrayList<String> tourServicesAvailable, int travelId, String travelName, Address travelLocation, String travelDescription, int rating, BigDecimal pricePerPerson, String travelContactPhone, String travelContactEmail) {
        super(travelId, travelName, travelLocation, travelDescription, rating, pricePerPerson, travelContactPhone, travelContactEmail);
        this.tourEntryFee = tourEntryFee;
        this.tourOpeningHours = tourOpeningHours;
        this.tourClosingHours = tourClosingHours;
        this.tourServicesAvailable = tourServicesAvailable;
    }

    

    public double getTourEntryFee() {
        return tourEntryFee;
    }

    public void setTourEntryFee(double tourEntryFee) {
        this.tourEntryFee = tourEntryFee;
    }

    public LocalTime getTourOpeningHours() {
        return tourOpeningHours;
    }

    public void setTourOpeningHours(LocalTime tourOpeningHours) {
        this.tourOpeningHours = tourOpeningHours;
    }

    public LocalTime getTourClosingHours() {
        return tourClosingHours;
    }

    public void setTourClosingHours(LocalTime tourClosingHours) {
        this.tourClosingHours = tourClosingHours;
    }

    public ArrayList<String> getTourServicesAvailable() {
        return tourServicesAvailable;
    }

    public void setTourServicesAvailable(ArrayList<String> tourServicesAvailable) {
        this.tourServicesAvailable = tourServicesAvailable;
    }

    @Override
    public String toString() {
        return "TouristDestination{" + "tourEntryFee=" + tourEntryFee + ", tourOpeningHours=" + tourOpeningHours + ", tourClosingHours=" + tourClosingHours + ", tourServicesAvailable=" + tourServicesAvailable + '}';
    }

}
