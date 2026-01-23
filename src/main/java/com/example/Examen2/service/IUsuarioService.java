package com.example.Examen2.service;

import com.example.Examen2.dto.UsuarioRequestDTO;
import com.example.Examen2.dto.UsuarioResponseDTO;

public interface IUsuarioService {
    UsuarioResponseDTO registrar(UsuarioRequestDTO dto);
    UsuarioResponseDTO login (UsuarioRequestDTO dto);

}
