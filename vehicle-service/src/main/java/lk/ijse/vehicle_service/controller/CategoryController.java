package lk.ijse.vehicle_service.controller;

import lk.ijse.vehicle_service.dto.CategoryDTO;
import lk.ijse.vehicle_service.dto.ResponseDTO;
import lk.ijse.vehicle_service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-03
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/vehicle/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseDTO saveOrUpdateCategory(@RequestBody CategoryDTO categoryDTO) {
        if (categoryDTO.getId() == null) {
            return categoryService.saveCategory(categoryDTO);
        } else {
            return categoryService.updateCategory(categoryDTO);
        }
    }

    @PostMapping("/dis/{id}")
    public ResponseDTO disableCategory(@RequestParam Long id) {
        return categoryService.disableCategory(id);
    }

    @PostMapping("/en/{id}")
    public ResponseDTO enableCategory(@RequestParam Long id) {
        return categoryService.enableCategory(id);
    }

    @PostMapping("/get/{id}")
    public ResponseDTO getCategory(@RequestParam Long id) {
        return categoryService.getCategory(id);
    }

    @PostMapping("/all")
    public ResponseDTO getAllCategories() {
        return categoryService.getAllCategories();
    }
}
