package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.domain.Objeto;
import co.com.encuentraloperdido.entity.ObjetoEntity;
import co.com.encuentraloperdido.repository.IObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjetoServiceImpl implements  IObjetoService {



    @Autowired
    private IObjetoRepository objetoRepository;

    @Override
    public List<ObjetoEntity> findAll() {
        return objetoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        objetoRepository.deleteById(id);
    }

    @Override
    public ObjetoEntity findById(Long id) {
        return objetoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ObjetoEntity objetoEntity) {
        objetoRepository.save(objetoEntity);
    }
}
