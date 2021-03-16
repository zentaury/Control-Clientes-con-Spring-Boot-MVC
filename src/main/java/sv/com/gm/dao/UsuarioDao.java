package sv.com.gm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.gm.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
