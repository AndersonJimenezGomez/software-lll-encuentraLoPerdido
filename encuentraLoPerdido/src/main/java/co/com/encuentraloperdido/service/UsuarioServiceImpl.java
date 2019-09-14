package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.domain.Usuario;
import co.com.encuentraloperdido.entity.UsuarioEntity;
import co.com.encuentraloperdido.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements  IUsuarioService {




    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public UsuarioEntity findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void save(UsuarioEntity usuarioEntity) {
        usuarioRepository.save(usuarioEntity);
    }
}
