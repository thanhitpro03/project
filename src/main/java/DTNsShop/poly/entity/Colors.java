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
@Table(name = "Colors")
public class Colors implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "[Name]")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "colors")
	private List<ProductImages> productImage;
	
	
}
