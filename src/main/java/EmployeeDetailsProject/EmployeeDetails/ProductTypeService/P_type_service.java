package EmployeeDetailsProject.EmployeeDetails.ProductTypeService;

import EmployeeDetailsProject.EmployeeDetails.Models.ProductTypeEntity;
import EmployeeDetailsProject.EmployeeDetails.Models.StatusCheck;
import EmployeeDetailsProject.EmployeeDetails.ProductRepository.P_type_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class P_type_service {
    @Autowired
    private P_type_repository pTypeRepository;

    public List<ProductTypeEntity> getAllProductTypes() {
        return pTypeRepository.findAll();
    }

    public void createProductType(ProductTypeEntity productTypeEntity) {
        if(productTypeEntity.getProductTypeId()!=null){
            pTypeRepository.findById(productTypeEntity.getProductTypeId()).map(edite ->{


                edite.setProductTypeName(productTypeEntity.getProductTypeName());
                edite.setProductTypeNameBn(productTypeEntity.getProductTypeNameBn());
                edite.setSequenceNumber(productTypeEntity.getSequenceNumber());

                edite.setStatus(productTypeEntity.getStatus());

                return pTypeRepository.save(edite);
            });

        }else {
            productTypeEntity.setStatus(StatusCheck.active);
             pTypeRepository.save(productTypeEntity);
        }

    }

    public Optional<ProductTypeEntity> getProductTypeById(Long id) {
        return pTypeRepository.findById(id);
    }
    public void deleteProductType(Long id) {
        pTypeRepository.deleteById(id);
    }
}
