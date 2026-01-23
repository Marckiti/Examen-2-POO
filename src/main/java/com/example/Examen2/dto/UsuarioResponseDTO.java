package com.example.Examen2.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioResponseDTO {
    private Long id;
    private String email, rol;
}
