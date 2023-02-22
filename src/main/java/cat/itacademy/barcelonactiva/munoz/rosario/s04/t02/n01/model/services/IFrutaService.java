package cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.munoz.rosario.s04.t02.n01.model.domain.Fruta;
import java.util.ArrayList;
import java.util.Optional;

public interface IFrutaService {

    Fruta add(Fruta fruta);

    Fruta update(Fruta fruta);

    boolean delete(long id);

    Optional<Fruta> getOne(long id);

    ArrayList<Fruta> getAll();

}
