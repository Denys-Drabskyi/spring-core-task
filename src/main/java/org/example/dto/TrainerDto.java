package org.example.dto;

import com.fasterxml.jackson.annotation.JsonView;
import java.util.UUID;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TrainerDto extends UserDto {
  private UUID id;
  @JsonView(Views.InList.class)
  @NotEmpty(message = "Specialization must not be empty")
  private String specialization;
}
