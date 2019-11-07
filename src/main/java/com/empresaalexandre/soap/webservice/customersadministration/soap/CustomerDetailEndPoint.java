package com.empresaalexandre.soap.webservice.customersadministration.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.empresaalexandre.soap.webservice.customersadministration.model.Artista;
import com.empresaalexandre.soap.webservice.customersadministration.model.Albuns;
import com.empresaalexandre.soap.webservice.customersadministration.service.CustomerDetailService;
import br.com.empresaalexandre.ArtistasEncontrados;
import br.com.empresaalexandre.ConsultaArtistaNomeRequest;
import br.com.empresaalexandre.ConsultaArtistaNomeResponse;
import br.com.empresaalexandre.ConsultaArtistaTamanhoRequest;
import br.com.empresaalexandre.ConsultaArtistaTamanhoResponse;
import br.com.empresaalexandre.ListaDeAlbuns;

@Endpoint
public class CustomerDetailEndPoint {
	
	@Autowired
	private CustomerDetailService service;

	@PayloadRoot(namespace="http://EmpresaAlexandre.com.br", localPart="ConsultaArtistaNomeRequest")
	@ResponsePayload
	public ConsultaArtistaNomeResponse consultaArtistaNomeRequest(@RequestPayload ConsultaArtistaNomeRequest req) {
		ConsultaArtistaNomeResponse resp = new ConsultaArtistaNomeResponse();
		List<Artista> resposta = (service.findArtistaNome(req.getNomeArtista(), req.getOrdem()));
		return convertToConsultaArtistaNomeResponse(resposta);
	}
	
	private ConsultaArtistaNomeResponse convertToConsultaArtistaNomeResponse(List<Artista> listaArtistas) {
		ConsultaArtistaNomeResponse resp = new ConsultaArtistaNomeResponse();
		listaArtistas.stream().forEach(c -> resp.getArtistasEncontrados().add(convertToArtistaDetail(c)));
		return resp;
	}
	
	private ArtistasEncontrados convertToArtistaDetail(Artista artista) {
		ArtistasEncontrados artistasEncontrados = new ArtistasEncontrados();
		artistasEncontrados.setId(artista.getId());
		artistasEncontrados.setNome(artista.getNome());
		if(artista.getAlbuns() != null && artista.getAlbuns().size() > 0) {
			for(Albuns albunAtual : artista.getAlbuns()) {
				ListaDeAlbuns temp = new ListaDeAlbuns();
				temp.setId(albunAtual.getId());
				temp.setNomeAlbun(albunAtual.getNomeAlbun());
				artistasEncontrados.getListaDeAlbuns().add(temp);
			}
		}
		
		return artistasEncontrados;
	}
	
	@PayloadRoot(namespace="http://EmpresaAlexandre.com.br", localPart="ConsultaArtistaTamanhoRequest")
	@ResponsePayload
	public ConsultaArtistaTamanhoResponse consultaArtistaTamanhoRequest(@RequestPayload ConsultaArtistaTamanhoRequest req) {
		ConsultaArtistaTamanhoResponse resp = new ConsultaArtistaTamanhoResponse();
		List<Artista> resposta = (service.findArtistaTamanho(req.getTamanhoNome(), req.getOrdem()));
		return convertToConsultaArtistaTamanhoResponse(resposta);
	}
	
	private ConsultaArtistaTamanhoResponse convertToConsultaArtistaTamanhoResponse(List<Artista> listaArtistas) {
		ConsultaArtistaTamanhoResponse resp = new ConsultaArtistaTamanhoResponse();
		listaArtistas.stream().forEach(c -> resp.getArtistasEncontrados().add(convertToArtistaDetail(c)));
		return resp;
	}
	
}
