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
public class Report2 implements Serializable {

	@Id
	private Account ac;
	private String name;
	private Long countOrderTotal;
	//private Long total;

}
