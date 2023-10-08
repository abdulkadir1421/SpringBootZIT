package EmployeeDetailsProject.EmployeeDetails.ProductTypeController;

import EmployeeDetailsProject.EmployeeDetails.Models.ProductTypeEntity;
import EmployeeDetailsProject.EmployeeDetails.ProductTypeService.P_type_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class P_type_controller {
    @Autowired
    P_type_service pTypeService;
    @GetMapping("/get_p_type")
    public List<ProductTypeEntity> getAll(){
        return pTypeService.getAllProductTypes();
    }

    @PostMapping("/post_p_type")
    public void newPost(@RequestBody ProductTypeEntity productTypeEntity) {
        pTypeService.createProductType(productTypeEntity);
    }


    @PutMapping("/update_p_type")
    public void update(@RequestBody ProductTypeEntity productTypeEntity){
        pTypeService.createProductType(productTypeEntity);
    }

    @DeleteMapping("/delete_p_type/{id}")
    public void deletes(@PathVariable("id") Long id){
        pTypeService.deleteProductType(id);
    }



    @GetMapping("/get_p_type_by_id/{id}")
    public Optional getById(@PathVariable("id") Long id){
        return pTypeService.getProductTypeById(id);
    }
}
