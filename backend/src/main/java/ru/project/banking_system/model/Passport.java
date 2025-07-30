package ru.project.banking_system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int passportNumber;

    private int passportSerial;

    private LocalDateTime passportIssuanceDate;

    public Passport() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getPassportIssuanceDate() {
        return passportIssuanceDate;
    }

    public void setPassportIssuanceDate(LocalDateTime passportIssuanceDate) {
        this.passportIssuanceDate = passportIssuanceDate;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(int passportSerial) {
        this.passportSerial = passportSerial;
    }
}
