/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Clinician extends User {

    protected String clinicianId;
    protected String title;
    protected String specialty;
    protected String gmcNumber;
    protected String workplaceId;
    protected String workplaceType;
    protected String employmentStatus;
    protected String startDate;

    public Clinician(String clinicianId, String firstName, String lastName,
                     String title, String specialty, String gmcNumber,
                     String phoneNumber, String email,
                     String workplaceId, String workplaceType,
                     String employmentStatus, String startDate) {

        super(clinicianId, firstName, lastName, email, phoneNumber);
        this.clinicianId = clinicianId;
        this.title = title;
        this.specialty = specialty;
        this.gmcNumber = gmcNumber;
        this.workplaceId = workplaceId;
        this.workplaceType = workplaceType;
        this.employmentStatus = employmentStatus;
        this.startDate = startDate;
    }

    public String getClinicianId() {
        return clinicianId;
    }
}
