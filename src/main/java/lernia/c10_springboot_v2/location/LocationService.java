package lernia.c10_springboot_v2.location;

import lernia.c10_springboot_v2.location.entity.Locations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    LocationRepository locationRepository;
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<LocationDto> getAllLocations() {
        return locationRepository.findAll().stream()
                .map(LocationDto::fromLocation)
                .toList();
    };

    public int addLocation(LocationDto locationDto) {
        Locations locations = new Locations();

        locations.setKategori(locationDto.kategori());
        locations.setUserId(locationDto.userId());
        locations.setPrivateLocation(locationDto.privateLocation());
        locations.setDescription(locationDto.description());

        locationRepository.save(locations);

        return locations.getId();
    };

}
