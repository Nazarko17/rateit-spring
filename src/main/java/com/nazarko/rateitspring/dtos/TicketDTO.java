package com.nazarko.rateitspring.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private int id;
    private String subject;
    private String text;

    @JsonProperty("status")
    private boolean status;

    private UserDTO userDTO;
}
