package emsi.ma.ebankingbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import emsi.ma.ebankingbackend.entities.BankAccount;
import emsi.ma.ebankingbackend.enums.OperationType;

/*import javax.persistence.*;*/
import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
