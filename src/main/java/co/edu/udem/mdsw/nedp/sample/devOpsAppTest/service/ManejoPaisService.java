package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.PaisDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.PaisesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ManejoPaisService implements ManejoPaisServiceInt{

    RestTemplate restTemplate;


    @Autowired
    public ManejoPaisService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public PaisDto getPais(String id){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Pais/"+ id;
        PaisDto pais = restTemplate.getForObject(
                url, PaisDto.class);
        return pais;
    }

    public List<PaisDto> getPaises(){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Pais/";
        PaisDto[] arr =  restTemplate.getForObject(
                url, PaisDto[].class);
        List<PaisDto> list = Arrays.asList(arr);
        return list;
    }

    public PaisDto savePais(PaisDto pais)  {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Pais/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PaisDto> entity = new HttpEntity<>(pais,headers);

        PaisDto paisDto = restTemplate.postForObject(url, entity, PaisDto.class);
        return paisDto;
    }


    public PaisDto updatePais(PaisDto paisDto ) {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Pais/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<PaisDto> entity = new HttpEntity<>(paisDto,headers);
        restTemplate.put(url, entity);
        return paisDto;
    }

    public PaisDto deletePais(String id){
        PaisDto paisDto = this.getPais(id);
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Pais/"+ id;
        restTemplate.delete(url);
        return paisDto;
    }
}
