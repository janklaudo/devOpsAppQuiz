package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class ManejoUsuarioService implements ManejoUsuarioServiceInt{

    RestTemplate restTemplate;


    @Autowired
    public ManejoUsuarioService(RestTemplate restTemplate){
         this.restTemplate = restTemplate;
    }

    public UsuarioDto getUsuario(String id){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Usuario/"+ id;
        UsuarioDto usuario = restTemplate.getForObject(
                url, UsuarioDto.class);
        return usuario;
    }

    public List<UsuarioDto> getUsuarios(){
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Usuario/";
        UsuarioDto[] arr =  restTemplate.getForObject(
                url, UsuarioDto[].class);
        List<UsuarioDto> list = Arrays.asList(arr);
        return list;

    }

    public UsuarioDto saveUsuario(UsuarioDto usuario)  {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Usuario/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuario,headers);

        UsuarioDto usuarioDto = restTemplate.postForObject(url, entity, UsuarioDto.class);
        return usuarioDto;
    }


    public UsuarioDto updateUsuario(UsuarioDto usuarioDto ) {
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Usuario/";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UsuarioDto> entity = new HttpEntity<>(usuarioDto,headers);
        restTemplate.put(url, entity);
        return usuarioDto;
    }

    public UsuarioDto deleteUsuario(String id){
        UsuarioDto usuarioDto = this.getUsuario(id);
        String url = "https://62859626f0e8f0bb7c063948.mockapi.io/api/v1/Usuario/"+ id;
        restTemplate.delete(url);
        return usuarioDto;
    }
}
