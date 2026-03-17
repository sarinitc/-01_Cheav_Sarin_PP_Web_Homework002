package org.example._1_cheav_sarin_pp_web_homework002.model;

import io.swagger.v3.oas.models.security.SecurityScheme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {

    private Integer instructor_id;
    private String instructor_name;
    private String email;

}
