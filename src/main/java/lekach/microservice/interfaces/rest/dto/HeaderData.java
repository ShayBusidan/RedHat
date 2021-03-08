package lekach.microservice.interfaces.rest.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HeaderData {

    private int queryType;
    private int subQueryType;
    private int customerNumber;
    private long userId;
    private int managerId;
    private int mursheId;
    private Date querySendTime; 
    private String ipAddress;
    private String authServiceId;
    private int environment;
    private int population;
    private int custId;
}


