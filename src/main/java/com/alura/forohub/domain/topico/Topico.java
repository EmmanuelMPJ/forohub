package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String titulo;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "id_usuario")
    private Usuario usuario;
    @JoinColumn(name= "nombre_curso")
    private String nombreCurso;
    @Enumerated(EnumType.STRING)
    private Estado estado = Estado.SIN_SOLUCION;
    private Boolean activo;

    public Topico(DatosRegistrarTopico datosRegistrarTopico, Usuario usuario) {
        this.activo = true;
        this.usuario = usuario;
        this.mensaje = datosRegistrarTopico.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.nombreCurso = datosRegistrarTopico.nombreCurso();
        this.titulo = datosRegistrarTopico.titulo();
    }

    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.estado() != null){
            this.estado = datosActualizarTopico.estado();
        }
        if (datosActualizarTopico.nombreCurso() != null){
            this.nombreCurso = datosActualizarTopico.nombreCurso();
        }
    }

    public void desactivar(){
        this.activo = false;
    }
}
