package coding.rentACar.dataAccess.abstracts;

import java.util.List;

import coding.rentACar.entities.concretes.Brand;


public interface BrandRepository {
	List<Brand> getAll();
}
