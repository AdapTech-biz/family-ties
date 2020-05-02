package xyd.programming.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;


@Data
public class FamilyMember {

    private String name;
    private Photo photo;
    private Role role;
    private List<Chore> dashboard;


    public FamilyMember(String name, Role role) {
        this.name = name;
        this.photo = new Photo("", LocalDateTime.now());
        this.role = role;
        this.dashboard = new LinkedList<>();
    }
}
