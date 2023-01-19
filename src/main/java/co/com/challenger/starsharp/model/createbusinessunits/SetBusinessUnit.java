package co.com.challenger.starsharp.model.createbusinessunits;
import co.com.challenger.starsharp.model.createbusinessunits.BusinessUnitModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class SetBusinessUnit {
    public List<BusinessUnitModel> setData(DataTable datatable) {
        List<BusinessUnitModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = datatable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, BusinessUnitModel.class));
        }
        return dates;
    }
}
