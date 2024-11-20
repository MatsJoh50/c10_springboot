package lernia.c10_springboot_v2.kategori;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController

public class KategoriController {

    KategoriService kategoriService;

    public KategoriController(KategoriService kategoriService) {
        this.kategoriService = kategoriService;
    }

    @GetMapping("/kategori")
    public List<KategoriDto> kategoriList() {
        return kategoriService.getAllKategorier();
    }

    @PostMapping("/kategori")
    public ResponseEntity<Void> createKategori(@RequestBody KategoriDto kategoriDto) {
        int id = kategoriService.addKategori(kategoriDto);
            return ResponseEntity.created(URI.create("/kategori/" + id)).build();
    };
}
