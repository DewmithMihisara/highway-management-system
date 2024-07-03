package lk.ijse.vehicle_service.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-03
 * @since 0.0.1
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO implements Serializable {
    private Long id;
    private String categoryName;
    private String createBy;
    private String modifyBy;
    private boolean isActive;
}
