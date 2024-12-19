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
public class Report3 implements Serializable {

	@Id
	private Categories group;
	private double sum;
	private long count;

}
