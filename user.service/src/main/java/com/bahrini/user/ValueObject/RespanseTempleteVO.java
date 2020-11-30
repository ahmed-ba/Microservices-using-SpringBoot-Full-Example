package com.bahrini.user.ValueObject;

import com.bahrini.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespanseTempleteVO {
    private User user;
    private Department department;

}
