package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.EmpleoDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EmpleosList {
    private List<EmpleoDto> empleosList;

    public EmpleosList() {
        empleosList = new ArrayList<>();
    }
    public List<EmpleoDto> getEmpleosList() {
        return empleosList ;
    }
}
