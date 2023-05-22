package com.jinsei.antares.productmanager.dto;

import java.time.LocalDate;

public record ProductDTO(String id, String name, Double price, LocalDate createdOn) {}
