package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.BarriosList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ManejoBarrioService implements ManejoBarrioServiceInt{

    RestTemplate restTemplate;


    @Autowired
    public ManejoBarrioService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public BarrioDto getBarrio(String id){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Barrio/"+ id;
        BarrioDto barrio = restTemplate.getForObject(
                url, BarrioDto.class);
        return barrio;
    }

    public List<BarrioDto> getBarrios(){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Barrio/";
        BarrioDto[] arr =  restTemplate.getForObject(
                url, BarrioDto[].class);
        List<BarrioDto> list = Arrays.asList(arr);
        return list;
    }

    public BarrioDto saveBarrio(BarrioDto barrio)  {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Barrio/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<BarrioDto> entity = new HttpEntity<>(barrio,headers);

        BarrioDto barrioDto = restTemplate.postForObject(url, entity, BarrioDto.class);
        return barrioDto;
    }


    public BarrioDto updateBarrio(BarrioDto barrioDto ) {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Barrio/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<BarrioDto> entity = new HttpEntity<>(barrioDto,headers);
        restTemplate.put(url, entity);
        return barrioDto;
    }

    public BarrioDto deleteBarrio(String id){
        BarrioDto barrioDto = this.getBarrio(id);
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Barrio/"+ id;
        restTemplate.delete(url);
        return barrioDto;
    }
}
