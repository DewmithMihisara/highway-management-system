package lk.ijse.payment_service.dto;

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
public class PaymentDTO implements Serializable {
    private Long id;
    private String cashierName;
    private Long cashierId;
    private double chargePerKm;
    private double totalKm;
    private double totalAmount;
    private Long ticketId;
    private String payedLocation;
    private String createBy;
    private String modifyBy;
    private boolean isActive;
}
