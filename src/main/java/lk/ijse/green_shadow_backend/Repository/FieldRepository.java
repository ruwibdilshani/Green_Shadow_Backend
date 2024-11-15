package lk.ijse.green_shadow_backend.Repository;


import lk.ijse.green_shadow_backend.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field, String> {

}
