/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Nurse extends Clinician {

    private String ward;

    public Nurse(String clinicianId, String firstName, String lastName,
                 String title, String specialty, String gmcNumber,
                 String phoneNumber, String email,
                 String workplaceId, String workplaceType,
                 String employmentStatus, String startDate,
                 String ward) {

        super(clinicianId, firstName, lastName, title, specialty,
              gmcNumber, phoneNumber, email,
              workplaceId, workplaceType, employmentStatus, startDate);
        this.ward = ward;
    }

    public void updatePatientRecord(PatientRecord record, String note) {
        record.addNote(note);
    }
}
