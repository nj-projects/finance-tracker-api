package me.nolanjames.financetrackerapi.expense;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * Service for expense module
 * @author Nolan James
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    /***
     * It will fetch the expenses from the database
     * @return list
     */
    public List<ExpenseResponse> getExpenses(){
        return expenseRepository.findAll().stream()
                .map(expense -> {
                    log.info("Expense: {}", expense);
                    return expenseMapper.mapToResponse(expense);
                })
                .toList();
    }
}
