package com.tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {

    @Size(max = 100, min = 3)
    @NotNull (message = "No message provided")
    @NotBlank(message = "No message provided")
    private String message;


}
