package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.entity.PublicacionEntity;
import co.com.encuentraloperdido.repository.IPublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionServiceImpl implements IPublicacionService{


    @Autowired
    private IPublicacionRepository publicacionRepository;

    @Override
    public List<PublicacionEntity> findAll() {
        return publicacionRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        publicacionRepository.deleteById(id);
    }

    @Override
    public PublicacionEntity findById(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(PublicacionEntity personaEntity) {
        publicacionRepository.save(personaEntity);
    }

}
