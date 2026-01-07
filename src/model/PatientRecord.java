/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class PatientRecord {

    private String recordId;
    private String patientId;
    private List<String> medicalHistory;

    public PatientRecord(String recordId, String patientId) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.medicalHistory = new ArrayList<>();
    }

    public void addNote(String note) {
        medicalHistory.add(note);
    }

    public List<String> getHistory() {
        return medicalHistory;
    }
}
