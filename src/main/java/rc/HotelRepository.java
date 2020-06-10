package rc;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{
    Optional<Hotel> findById(String id);
//    List<Hotel> findByPricePerNightLessThan(int maxPrice);
//
//    @Query(value = "{address.city:?0}")
//    List<Hotel> findByCity(String city);
}