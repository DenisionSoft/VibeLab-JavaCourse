package com.example.javacorespring;

import com.example.javacorespring.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class FinesDB {

    private static long counter = 0;
    private static final List<Fine> fines = new ArrayList<>();


    public static Fine findFine(long id) {
        return fines.stream()
                .filter(fine -> fine.getId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    public static List<Fine> getAll() {
        return fines;
    }

    public static Fine getOne(long id) {
        return findFine(id);
    }

    public static Fine addFine(Fine fine) {
        fine.setId(++counter);
        fines.add(fine);
        return fine;
    }

    public static Fine updateFine(long id, Fine fine) {
        Fine fineToUpdate = findFine(id);

        fineToUpdate.setCar(fine.getCar());
        fineToUpdate.setViolator(fine.getViolator());
        fineToUpdate.setOfficer(fine.getOfficer());
        fineToUpdate.setDate(fine.getDate());
        fineToUpdate.setAmount(fine.getAmount());
        fineToUpdate.setDatePaid(fine.getDatePaid());
        fineToUpdate.setDateToPay(fine.getDateToPay());
        fineToUpdate.setSubpoena(fine.getSubpoena());
        fineToUpdate.setPaid(fine.getPaid());

        return fineToUpdate;
    }

    public static void deleteFine(long id) {
        Fine fine = findFine(id);
        fines.remove(fine);
    }

    public static void payFine(long id) {
        Fine fine = findFine(id);
        fine.setPaid(true);
    }

    public static void sendSubpoena(long id) {
        Fine fine = findFine(id);
        fine.setSubpoena(true);
    }
}
