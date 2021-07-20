package com.pawanj09.springboot.restfulservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
@NoArgsConstructor
public class SvcConfiguration {
  
  private int minimum;
  private int maximum;

}
