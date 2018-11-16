package ua.devilsega.insurancecustomerapp.osago.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.devilsega.insurancecustomerapp.osago.model.Coefficient;

import java.util.List;

/**
 * JPA repository interface to work with osago_coefficients table
 *
 * @author devilsega
 */
public interface CoefficientRepository extends JpaRepository<Coefficient,String> {
    List <Coefficient> findByGroup(String group);
    List <Coefficient> findByFilterParam(String filterParam);
}
