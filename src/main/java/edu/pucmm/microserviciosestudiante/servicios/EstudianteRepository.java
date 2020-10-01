package edu.pucmm.microserviciosestudiante.servicios;

import edu.pucmm.microserviciosestudiante.modelos.Estudiante;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "estudiantes", path = "estudiante")
public interface EstudianteRepository extends PagingAndSortingRepository<Estudiante, Integer> {
    
}
