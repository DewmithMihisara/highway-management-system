package lk.ijse.persistence_service.dto;

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
public class VehicleDTO implements Serializable {
    private Long id;
    private String vehicleNumber;
    private String vehicleBrand;
    private String vehicleModel;
    private Long categoryId;
    private String createBy;
    private String modifyBy;
    private boolean isActive;
}
