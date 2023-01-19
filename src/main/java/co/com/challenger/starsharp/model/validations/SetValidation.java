package co.com.challenger.starsharp.model.validations;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class SetValidation {
    public List<ValidationModel> setData(DataTable datatable) {
        List<ValidationModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = datatable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, ValidationModel.class));
        }
        return dates;
    }
}
