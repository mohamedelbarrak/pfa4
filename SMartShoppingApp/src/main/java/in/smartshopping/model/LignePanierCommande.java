package in.smartshopping.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LignePanierCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long lignePanierCommandeId;
	
	private int quantite;
	
    @ManyToOne(cascade = {CascadeType.DETACH , CascadeType.PERSIST
            , CascadeType.MERGE , CascadeType.REFRESH})
    @JoinColumn(name = "productId")
    private Product product;
	
}
