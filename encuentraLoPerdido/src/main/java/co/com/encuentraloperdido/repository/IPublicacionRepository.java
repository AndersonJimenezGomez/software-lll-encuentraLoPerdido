package co.com.encuentraloperdido.repository;

import co.com.encuentraloperdido.entity.PublicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublicacionRepository extends JpaRepository<PublicacionEntity,Long> {
}
