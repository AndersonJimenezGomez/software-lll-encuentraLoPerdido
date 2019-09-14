package co.com.encuentraloperdido.repository;

import co.com.encuentraloperdido.entity.LugarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILugarRepository extends JpaRepository <LugarEntity, Long> {
}
