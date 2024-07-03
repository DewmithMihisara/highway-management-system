package lk.ijse.persistence_service.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author Dewmith Mihisara
 * @date 2024-07-04
 * @since 0.0.1
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthDTO implements Serializable {
    private String email;
    private String password;
}
