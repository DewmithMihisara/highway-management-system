package lk.ijse.user_service.dto;

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
public class UserDTO implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String mobile;
    private String createBy;
    private String modifyBy;
    private boolean isActive;
}
