package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.mClass;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 23, 2023
 */
@Repository
public interface mClassRepository extends JpaRepository<mClass, Long> {

}
