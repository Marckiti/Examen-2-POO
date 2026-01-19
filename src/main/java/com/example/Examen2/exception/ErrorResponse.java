package com.example.Examen2.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Map;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String mensaje;
    private Map<String, String> detalles;
}
