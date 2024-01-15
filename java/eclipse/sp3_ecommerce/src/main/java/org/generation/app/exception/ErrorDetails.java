package org.generation.app.exception;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorCode;
}