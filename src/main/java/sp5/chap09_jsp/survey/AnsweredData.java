package sp5.chap09_jsp.survey;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AnsweredData {
    private List<String> responses;
    private Respondent res;
}
