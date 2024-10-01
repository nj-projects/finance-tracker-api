package me.nolanjames.financetrackerapi.expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
