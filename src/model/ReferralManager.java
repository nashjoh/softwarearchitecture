/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class ReferralManager {

    private static ReferralManager instance;
    private List<Referral> referrals;

    private ReferralManager() {
        referrals = new ArrayList<>();
    }

    public static synchronized ReferralManager getInstance() {
        if (instance == null) {
            instance = new ReferralManager();
        }
        return instance;
    }

    public Referral createReferral(String fromClinicianId,
                                   String patientId,
                                   String toClinicianId,
                                   String referringFacilityId,
                                   String referredToFacilityId,
                                   String urgency,
                                   String reason,
                                   String clinicalSummary,
                                   String investigations) {

        Referral referral = new Referral(
                "REF" + System.currentTimeMillis(),
                patientId,
                fromClinicianId,
                toClinicianId,
                referringFacilityId,
                referredToFacilityId,
                urgency,
                reason,
                clinicalSummary,
                investigations
        );

        referrals.add(referral);
        return referral;
    }

    public List<Referral> getAllReferrals() {
        return referrals;
    }
}
