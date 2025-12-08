package com.example.test.pismo.application.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;

public record AccountDTO(
        @JsonProperty("document_number")
        String documentNumber) {

}
