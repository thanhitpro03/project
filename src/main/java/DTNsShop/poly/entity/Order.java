package DTNsShop.poly.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Orders")
public class Order implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne @JoinColumn(name = "Username")
	private Account account;
	
	@OneToMany(mappedBy = "order") 
	private List<OrderDetails> orderdetail;
	
	@Temporal(TemporalType.DATE)
	private Date createdate = new Date();
	
	@Column(name = "[address]")
	private String address;
	
	@Column(name="[status]")
	private Boolean status;

	private Boolean cancelorder;

}
