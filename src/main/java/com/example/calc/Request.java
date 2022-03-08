package com.example.calc;

import lombok.*;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@Getter
@Setter
public class Request {

    @NotNull
    private int requestId;

    @NotNull
    private String requestValue;
}
