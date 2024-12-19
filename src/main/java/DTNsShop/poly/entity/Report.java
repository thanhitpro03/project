package DTNsShop.poly.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Report implements Serializable {

	@Id
	private Product fav;
	private String name;
	private Long count;

}
