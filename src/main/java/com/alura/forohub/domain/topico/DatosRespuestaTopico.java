package com.alura.forohub.domain.topico;

public record DatosRespuestaTopico(Long id,
                                   String mensaje,
                                   String nombreCurso,
                                   String titulo,
                                   Estado estado) {
}
