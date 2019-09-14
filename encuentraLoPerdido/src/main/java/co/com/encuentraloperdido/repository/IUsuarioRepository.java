package co.com.encuentraloperdido.repository;

import co.com.encuentraloperdido.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
