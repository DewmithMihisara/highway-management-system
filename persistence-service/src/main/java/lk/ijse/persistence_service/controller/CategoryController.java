package lk.ijse.persistence_service.controller;

import lk.ijse.persistence_service.dto.CategoryDTO;
import lk.ijse.persistence_service.dto.ResponseDTO;
import lk.ijse.persistence_service.service.CategoryService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-03
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/persistence/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseDTO saveOrUpdateCategory(@RequestBody CategoryDTO categoryDTO) {
        try {
            if (categoryDTO.getId() == null) {
                return categoryService.saveCategory(categoryDTO);
            } else {
                return categoryService.updateCategory(categoryDTO);
            }
        }catch (Exception e){
            return new ResponseDTO("Internal Server Error", 500);
        }
    }

    @PostMapping("/dis/{id}")
    public ResponseDTO disableCategory(@RequestParam Long id) {
        try {
            return categoryService.disableCategory(id);
        }catch (Exception e){
            return new ResponseDTO("Internal Server Error", 500);
        }
    }

    @PostMapping("/en/{id}")
    public ResponseDTO enableCategory(@RequestParam Long id) {
        try {
            return categoryService.enableCategory(id);
        }catch (Exception e){
            return new ResponseDTO("Internal Server Error", 500);
        }
    }

    @GetMapping
    public ResponseDTO getAllCategory() {
        try {
            return categoryService.getAllCategories();
        }catch (Exception e){
            return new ResponseDTO("Internal Server Error", 500);
        }
    }

    @GetMapping("/{id}")
    public ResponseDTO getCategory(@RequestParam Long id) {
        try {
            return categoryService.getCategory(id);
        }catch (Exception e){
            return new ResponseDTO("Internal Server Error", 500);
        }
    }
}
