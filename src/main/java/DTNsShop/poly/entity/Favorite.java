package DTNsShop.poly.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Favorites")
public class Favorite implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne @JoinColumn(name="productid")
	private Product product;
	
	@ManyToOne @JoinColumn(name = "userid")
	private Account userid;
	
	@Temporal(TemporalType.DATE)
	private Date likedate = new Date();

}
