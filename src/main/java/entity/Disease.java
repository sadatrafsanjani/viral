package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Disease {


    private int id;
    private Virus virus;
    private String name;
    private String fatality;
}
