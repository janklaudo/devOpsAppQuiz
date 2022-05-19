package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.utils;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.PaisDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaisesList {
    private List<PaisDto> paisesList;

    public PaisesList() {
        paisesList = new ArrayList<>();
    }

    public List<PaisDto> getPaisesList() {
        return paisesList ;
    }
}
