package lernia.c10_springboot_v2.kategori;

import lernia.c10_springboot_v2.kategori.entity.Kategori;

public record KategoriDto(String name, String symbol, String description) {

    public static KategoriDto fromKategori(Kategori kategori){
        return new KategoriDto(kategori.getName(), kategori.getSymbol(), kategori.getDescription());
    }
}
