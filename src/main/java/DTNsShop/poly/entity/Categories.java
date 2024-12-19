package DTNsShop.poly.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Categories")
public class Categories implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	private String id;
	@Column(name = "[Name]")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private List<Product> product;

	public Categories(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 
	
	

}
