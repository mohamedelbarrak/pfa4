package in.smartshopping.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartshopping.model.Commande;


@Repository
public interface CommandeRepo extends JpaRepository<Commande, Long> {

    List<Commande> findAll();
    
    Optional<Commande> findBycommandeId(Long commandeId);

    
}