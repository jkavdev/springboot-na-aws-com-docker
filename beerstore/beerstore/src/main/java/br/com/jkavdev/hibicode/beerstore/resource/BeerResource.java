package br.com.jkavdev.hibicode.beerstore.resource;

import br.com.jkavdev.hibicode.beerstore.Beers;
import br.com.jkavdev.hibicode.beerstore.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerResource {

    @Autowired
    private Beers beers;

    @GetMapping
    public List<Beer> all() {
        return beers.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Beer create(@Valid @RequestBody Beer beer) {
        return beers.save(beer);
    }

}
