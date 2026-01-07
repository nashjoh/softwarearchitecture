/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class GP extends Clinician {

    public GP(String clinicianId, String firstName, String lastName,
              String title, String specialty, String gmcNumber,
              String phoneNumber, String email,
              String workplaceId, String workplaceType,
              String employmentStatus, String startDate) {

        super(clinicianId, firstName, lastName, title, specialty,
              gmcNumber, phoneNumber, email,
              workplaceId, workplaceType, employmentStatus, startDate);
    }

    public Prescription createPrescription(Patient patient,
                                           String appointmentId,
                                           String medication,
                                           String dosage,
                                           String frequency,
                                           int durationDays,
                                           String quantity,
                                           String instructions,
                                           String pharmacyName) {

        return new Prescription(
                "RX" + System.currentTimeMillis(),
                patient.getPatientId(),
                this.clinicianId,
                appointmentId,
                medication,
                dosage,
                frequency,
                durationDays,
                quantity,
                instructions,
                pharmacyName,
                "Issued"
        );
    }

    public Referral generateReferral(Patient patient,
                                     String referredToClinicianId,
                                     String referredToFacilityId,
                                     String urgency,
                                     String reason,
                                     String clinicalSummary,
                                     String investigations) {

        return ReferralManager.getInstance().createReferral(
                this.clinicianId,
                patient.getPatientId(),
                referredToClinicianId,
                this.workplaceId,
                referredToFacilityId,
                urgency,
                reason,
                clinicalSummary,
                investigations
        );
    }
}
