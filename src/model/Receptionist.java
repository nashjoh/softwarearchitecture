/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Receptionist extends User {

    private String staffId;
    private String department;
    private String facilityId;
    private String employmentStatus;
    private String accessLevel;

    public Receptionist(String staffId, String firstName, String lastName,
                         String email, String phoneNumber,
                         String department, String facilityId,
                         String employmentStatus, String accessLevel) {

        super(staffId, firstName, lastName, email, phoneNumber);
        this.staffId = staffId;
        this.department = department;
        this.facilityId = facilityId;
        this.employmentStatus = employmentStatus;
        this.accessLevel = accessLevel;
    }
}
