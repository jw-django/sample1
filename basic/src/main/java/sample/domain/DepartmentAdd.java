package sample.domain;

import java.util.*;
import lombok.*;
import sample.domain.*;
import sample.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdd() {
        super();
    }
}
