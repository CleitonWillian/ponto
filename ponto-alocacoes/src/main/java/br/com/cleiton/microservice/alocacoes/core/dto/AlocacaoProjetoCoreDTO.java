package br.com.cleiton.microservice.alocacoes.core.dto;

import java.time.Duration;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlocacaoProjetoCoreDTO {

	private String nome;
	private Duration tempo;
	private LocalDate criadoNoDia;
	private String usuario;
	
}
