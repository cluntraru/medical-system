package com.cluntraru.prescription;

import com.cluntraru.management.ManagementAuthority;
import com.cluntraru.person.Person;

public class Prescription {
    private static int prescriptionCount = 0;
    private final int id = prescriptionCount;

    private boolean isActive;
    private String medName;
    private Person prescribedTo;

    public Prescription(String medName, Person prescribedTo) {
        this.medName = medName;
        this.prescribedTo = prescribedTo;
        isActive = true;

        // TODO (CL): mutex
        ++prescriptionCount;
    }

    public String getMedicineName() {
        return medName;
    }

    public Person getPrescribedTo() {
        return prescribedTo;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getId() {
        return id;
    }

    public void archive() {
        isActive = false;
    }
}
