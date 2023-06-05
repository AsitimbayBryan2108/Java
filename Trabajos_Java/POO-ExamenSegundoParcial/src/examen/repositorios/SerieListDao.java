package examen.repositorios;

import java.util.ArrayList;
import java.util.List;

import examen.dominio.Serie;

public class SerieListDao implements ISerieDao {

    List <Serie> serie= new ArrayList<>();

    public SerieListDao()
   {
      serie.add(new Serie(20,"GoF", "Temporada 1", 25));
   }

    @Override
    public Serie buscar(int codigo) {
        for (Serie serie : serie) 
      {
         if (serie.getCodigo() == codigo)
            return serie;
      }   

      return null;
        
    }
    
}
