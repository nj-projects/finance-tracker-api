package me.nolanjames.financetrackerapi.expense;

import org.springframework.stereotype.Service;

/***
 * Mapper for the expense module
 * @author Nolan James
 */
@Service
public class ExpenseMapper {
    /***
     * Maps and expense entity object to an expenseResponse
     * @param expense
     * @return expenseResponse
     */
    public ExpenseResponse mapToResponse(Expense expense) {
        return new ExpenseResponse(
                expense.getPublicId().toString(),
                expense.getName(),
                expense.getNote(),
                expense.getCategory(),
                expense.getDate(),
                expense.getAmount(),
                expense.getCreatedAt(),
                expense.getUpdatedAt()
        );
    }
}
