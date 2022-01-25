package in.smartshopping.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartshopping.model.LignePanierCommande;

@Repository
public interface LignePanierCommandeRepo extends JpaRepository<LignePanierCommande, Long> {

    List<LignePanierCommande> findAll();
    
    Optional<LignePanierCommande> findBylignePanierCommandeId(Long lignePanierCommandeId);

    
}