package com.antares.jinsei.dto;

import java.time.LocalDate;

public record ProductDTO(String id, String name, Double price, LocalDate createdOn) {}
