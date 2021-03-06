package br.com.cleiton.microservice.relatorio.outbound.rest.alocacoes.json.response;

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
public class AlocacaoHorasTrabalhadaResponseJson {

	public LocalDate dia;
	public Duration tempo;
	public String nomeProjeto;
	
	
}
