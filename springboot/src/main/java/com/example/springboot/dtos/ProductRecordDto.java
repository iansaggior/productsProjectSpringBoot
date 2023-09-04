package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/***
 * @author Ian S. pereira
 */
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
}
