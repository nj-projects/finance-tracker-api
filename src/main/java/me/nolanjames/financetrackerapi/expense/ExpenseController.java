package me.nolanjames.financetrackerapi.expense;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * This is the controller class for Expense module
 * @author Nolan James
 */

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExpenseController {
    private final ExpenseService expenseService;

    /***
     * It will fetch the expenses from the database
     * @return list
     */
    @GetMapping("/expenses")
    public ResponseEntity<List<ExpenseResponse>> getExpenses() {
        log.info("API [Get] /expenses called");
        return new ResponseEntity<>(expenseService.getExpenses(), HttpStatus.OK);
    }
}
