package coding.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coding.rentACar.business.abstracts.BrandService;
import coding.rentACar.entities.concretes.Brand;

@RestController//annotation
@RequestMapping("/api/brands")
public class BrandsConroller {
	private BrandService brandService;

	@Autowired
	public BrandsConroller(BrandService brandService) {
		
		this.brandService = brandService;
	}
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
}
