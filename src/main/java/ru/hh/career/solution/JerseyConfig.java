package ru.hh.career.solution;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExampleResource.class)
public class JerseyConfig {
}
