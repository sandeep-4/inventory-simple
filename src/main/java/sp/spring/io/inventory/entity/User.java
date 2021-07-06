package sp.spring.io.inventory.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NamedQuery(name="User.findAll" ,query="SELECT u FROM User u")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	
	private String createdUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;
	
	private String lastModifiedUser;

	private String iserAddress;
	
	private String userAddress;

	private BigDecimal userContactNumber;

	private String userEmail;

	private String userFname;

	private String userLname;

	private String userName;

	private BigDecimal version;
	
	@OneToMany(mappedBy="user")
	private List<UserRole> userRole;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
