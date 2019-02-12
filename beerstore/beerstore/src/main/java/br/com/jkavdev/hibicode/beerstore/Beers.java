package br.com.jkavdev.hibicode.beerstore;

import br.com.jkavdev.hibicode.beerstore.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Beers extends JpaRepository<Beer, Long> {



}
