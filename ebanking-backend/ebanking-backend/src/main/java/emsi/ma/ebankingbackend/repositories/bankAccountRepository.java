package emsi.ma.ebankingbackend.repositories;

import emsi.ma.ebankingbackend.entities.BankAccount;
import emsi.ma.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bankAccountRepository extends JpaRepository<BankAccount,String> {

}
