package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.EmpleoDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils.EmpleosList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ManejoEmpleoService implements ManejoEmpleoServiceInt{

    RestTemplate restTemplate;


    @Autowired
    public ManejoEmpleoService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public EmpleoDto getEmpleo(String id){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Empleo/"+ id;
        EmpleoDto empleo = restTemplate.getForObject(
                url, EmpleoDto.class);
        return empleo;
    }

    public List<EmpleoDto> getEmpleos(){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Empleo/";
        EmpleoDto[] arr =  restTemplate.getForObject(
                url, EmpleoDto[].class);
        List<EmpleoDto> list = Arrays.asList(arr);
        return list;
    }

    public EmpleoDto saveEmpleo(EmpleoDto empleo)  {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Empleo/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<EmpleoDto> entity = new HttpEntity<>(empleo,headers);

        EmpleoDto empleoDto = restTemplate.postForObject(url, entity, EmpleoDto.class);
        return empleoDto;
    }


    public EmpleoDto updateEmpleo(EmpleoDto empleoDto ) {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Empleo/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<EmpleoDto> entity = new HttpEntity<>(empleoDto,headers);
        restTemplate.put(url, entity);
        return empleoDto;
    }

    public EmpleoDto deleteEmpleo(String id){
        EmpleoDto empleoDto = this.getEmpleo(id);
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Empleo/"+ id;
        restTemplate.delete(url);
        return empleoDto;
    }
}
