package coding.rentACar.business.abstracts;

import java.util.List;

import coding.rentACar.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
