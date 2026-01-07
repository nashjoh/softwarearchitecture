/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Specialist extends Clinician {

    public Specialist(String clinicianId, String firstName, String lastName,
                      String title, String specialty, String gmcNumber,
                      String phoneNumber, String email,
                      String workplaceId, String workplaceType,
                      String employmentStatus, String startDate) {

        super(clinicianId, firstName, lastName, title, specialty,
              gmcNumber, phoneNumber, email,
              workplaceId, workplaceType, employmentStatus, startDate);
    }

    public void receiveReferral(Referral referral) {
        referral.setStatus("In Progress");
    }
}
