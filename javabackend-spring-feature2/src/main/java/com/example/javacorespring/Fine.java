package com.example.javacorespring;

public class Fine {
    private long id;
    private String car, violator, officer, date, amount, datePaid, dateToPay;
    private Boolean isSubpoena, isPaid;

    public Fine(long id, String car, String violator, String officer, String date, String amount, String datePaid, String dateToPay, Boolean isSubpoena, Boolean isPaid) {
        this.id = id;
        this.car = car;
        this.violator = violator;
        this.officer = officer;
        this.date = date;
        this.amount = amount;
        this.datePaid = datePaid;
        this.dateToPay = dateToPay;
        this.isSubpoena = isSubpoena;
        this.isPaid = isPaid;
    }

    public long getId() {
        return id;
    }

    public String getCar() {
        return car;
    }

    public String getViolator() {
        return violator;
    }

    public String getOfficer() {
        return officer;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public String getDateToPay() {
        return dateToPay;
    }

    public Boolean getSubpoena() {
        return isSubpoena;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    // Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setViolator(String violator) {
        this.violator = violator;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public void setDateToPay(String dateToPay) {
        this.dateToPay = dateToPay;
    }

    public void setSubpoena(Boolean isSubpoena) {
        this.isSubpoena = isSubpoena;
    }

    public void setPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
}
