package lernia.c10_springboot_v2.kategori;

import lernia.c10_springboot_v2.kategori.entity.Kategori;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriService {

    KategoriRepository kategoriRepository;
    public KategoriService(KategoriRepository kategoriRepository) {
        this.kategoriRepository = kategoriRepository;
    }



    public List<KategoriDto> getAllKategorier() {
        return kategoriRepository.findAll().stream()
                .map(KategoriDto::fromKategori)
                .toList();
    };

    public int addKategori(KategoriDto kategoriDto) {
        Kategori kategori = new Kategori();
        kategori.setName(kategoriDto.name());
        kategori.setSymbol(kategoriDto.symbol());
        kategori.setDescription(kategoriDto.description());

        kategoriRepository.save(kategori);

            return kategori.getId();
    };
};
