package me.nolanjames.financetrackerapi.expense;

import java.math.BigDecimal;

import java.security.Timestamp;
import java.time.LocalDate;

public record ExpenseResponse(
        String publicId,
        String name,
        String note,
        String category,
        LocalDate date,
        BigDecimal amount,
        Timestamp createdAt,
        Timestamp updatedAt
) {
}
