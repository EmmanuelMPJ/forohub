package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.usuario.Usuario;
import com.alura.forohub.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicoService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    @Autowired
    public TopicoRepository topicoRepository;


    public Topico registrarTopico(DatosRegistrarTopico datosRegistrarTopico){
        Usuario usuario = usuarioRepository.getReferenceById(datosRegistrarTopico.idUsuario());
        return topicoRepository.save(new Topico(datosRegistrarTopico, usuario));
    }

    public List<DatosListadoTopicos> listarTopicos(){
        return topicoRepository.findByActivoTrue().stream()
                .map(DatosListadoTopicos::new)
                .collect(Collectors.toList());
    }


}
