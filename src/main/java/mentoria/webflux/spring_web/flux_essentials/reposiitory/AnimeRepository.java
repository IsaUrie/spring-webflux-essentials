package mentoria.webflux.spring_web.flux_essentials.reposiitory;


import mentoria.webflux.spring_web.flux_essentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

}
