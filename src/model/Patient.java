/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Patient extends User {

    private String patientId;
    private String dateOfBirth;
    private String nhsNumber;
    private String gender;
    private String address;
    private String postcode;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String registrationDate;
    private String gpSurgeryId;

    public Patient(String patientId, String firstName, String lastName,
                   String dateOfBirth, String nhsNumber, String gender,
                   String phoneNumber, String email, String address,
                   String postcode, String emergencyContactName,
                   String emergencyContactPhone, String registrationDate,
                   String gpSurgeryId) {

        super(patientId, firstName, lastName, email, phoneNumber);
        this.patientId = patientId;
        this.dateOfBirth = dateOfBirth;
        this.nhsNumber = nhsNumber;
        this.gender = gender;
        this.address = address;
        this.postcode = postcode;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.registrationDate = registrationDate;
        this.gpSurgeryId = gpSurgeryId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getNhsNumber() {
        return nhsNumber;
    }
}
