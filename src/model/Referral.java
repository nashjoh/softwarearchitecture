/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Referral {

    private String referralId;
    private String patientId;
    private String fromClinicianId;
    private String toClinicianId;
    private String referringFacilityId;
    private String referredToFacilityId;
    private String urgencyLevel;
    private String referralReason;
    private String clinicalSummary;
    private String requestedInvestigations;
    private String status;

    public Referral(String referralId, String patientId,
                    String fromClinicianId, String toClinicianId,
                    String referringFacilityId, String referredToFacilityId,
                    String urgencyLevel, String referralReason,
                    String clinicalSummary, String requestedInvestigations) {

        this.referralId = referralId;
        this.patientId = patientId;
        this.fromClinicianId = fromClinicianId;
        this.toClinicianId = toClinicianId;
        this.referringFacilityId = referringFacilityId;
        this.referredToFacilityId = referredToFacilityId;
        this.urgencyLevel = urgencyLevel;
        this.referralReason = referralReason;
        this.clinicalSummary = clinicalSummary;
        this.requestedInvestigations = requestedInvestigations;
        this.status = "New";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
