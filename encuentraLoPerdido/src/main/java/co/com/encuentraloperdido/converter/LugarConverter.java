package co.com.encuentraloperdido.converter;

import co.com.encuentraloperdido.domain.Lugar;
import co.com.encuentraloperdido.entity.LugarEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LugarConverter {

    public Lugar entityToModel(LugarEntity lugarEntity){
        Lugar lugar = new Lugar();
        lugar.setIdLugar(lugarEntity.getIdLugar());
        lugar.setDireccion(lugarEntity.getDireccion());
        lugar.setDescripcionLugar(lugarEntity.getDescripcionLugar());
        return lugar;
    }

    public LugarEntity modelToEntity(Lugar lugar){
        LugarEntity lugarEntity = new LugarEntity();
        lugarEntity.setIdLugar(lugar.getIdLugar());
        lugarEntity.setDescripcionLugar(lugar.getDescripcionLugar());
        lugarEntity.setDireccion(lugar.getDireccion());
        return lugarEntity;
    }

    public List<Lugar>entityToModel(List<LugarEntity> lugaresEntity){
        List<Lugar> lugares = new ArrayList<>(lugaresEntity.size());
        lugaresEntity.forEach(lugarEntity -> {
            lugares.add(entityToModel(lugarEntity));
        });
        return lugares;
    }
}
