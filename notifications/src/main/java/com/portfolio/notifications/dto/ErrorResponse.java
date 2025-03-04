package com.portfolio.notifications.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ErrorResponse {

    private String apiPath;
    private String errorCode;
    private String errorMessage;


}
