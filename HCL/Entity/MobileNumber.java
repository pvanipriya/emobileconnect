ackage com.emobileconnect.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mobile_number")
public class MobileNumber {

        private Integer mobileId;
	private Long mobileNumber;
	private String mobileStatus;
}