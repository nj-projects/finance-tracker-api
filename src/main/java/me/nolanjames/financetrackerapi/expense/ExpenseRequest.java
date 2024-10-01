package me.nolanjames.financetrackerapi.expense;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseRequest (
        String name,
        String note,
        String category,
        LocalDate date,
        BigDecimal amount
) {
}
