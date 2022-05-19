package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities;


import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {
    public String id;
    public String nombre;
    public String email;
}
