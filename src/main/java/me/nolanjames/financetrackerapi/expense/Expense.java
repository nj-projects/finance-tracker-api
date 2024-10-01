package me.nolanjames.financetrackerapi.expense;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Expense {
    @Id
    @GeneratedValue
    private Long id;
    private UUID publicId;
    private String name;
    private String note;
    private String category;
    private LocalDate date;
    private BigDecimal amount;
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
}
