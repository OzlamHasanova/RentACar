package coding.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coding.rentACar.business.abstracts.BrandService;
import coding.rentACar.dataAccess.abstracts.BrandRepository;
import coding.rentACar.entities.concretes.Brand;
@Service
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		
		return brandRepository.getAll();
	}
	
}
