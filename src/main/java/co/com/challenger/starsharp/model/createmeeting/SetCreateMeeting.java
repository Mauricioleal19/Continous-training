package co.com.challenger.starsharp.model.createmeeting;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class SetCreateMeeting {
    public List<CreateMeetingModel> setData(DataTable datatable) {
        List<CreateMeetingModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = datatable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, CreateMeetingModel.class));
        }
        return dates;
    }
}
