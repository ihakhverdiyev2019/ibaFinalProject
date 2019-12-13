package iba.Final.Project.ibaFinalProject.Repository;

import iba.Final.Project.ibaFinalProject.Domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
