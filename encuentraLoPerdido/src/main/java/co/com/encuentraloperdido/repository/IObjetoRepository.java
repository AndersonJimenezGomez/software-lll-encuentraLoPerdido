package co.com.encuentraloperdido.repository;

import co.com.encuentraloperdido.entity.ObjetoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IObjetoRepository extends JpaRepository<ObjetoEntity,Long> {
}
