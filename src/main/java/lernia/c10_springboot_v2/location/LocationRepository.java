package lernia.c10_springboot_v2.location;

import org.springframework.data.repository.ListCrudRepository;
import lernia.c10_springboot_v2.location.entity.Locations;

//    public interface KategoriRepository extends ListCrudRepository<Kategori, Integer>
public interface LocationRepository extends ListCrudRepository<Locations, Long> {

}
