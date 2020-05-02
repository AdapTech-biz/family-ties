package xyd.progamming.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyd.programming.domain.Child;
import xyd.programming.domain.FamilyTitle;
import xyd.programming.domain.Gender;
import xyd.programming.domain.Parent;
import xyd.programming.service.FamilyTreeService;

import java.util.List;

@SpringBootTest(classes = FamilyTreeService.class)
public class FamilyTreeServiceTest {

    private FamilyTreeService familyTreeService;


    @BeforeEach
    void setUp() {
        familyTreeService = new FamilyTreeService();
    }

    @Test
    void createParent() {
        Parent parent =familyTreeService.createParent("Xavier", FamilyTitle.Dad);
        Assertions.assertThat(parent.getName()).isEqualTo("Xavier");

        List<Child> childList = parent.getChildren();
        Assertions.assertThat(childList.size()).isEqualTo(0);
    }

    @Test
    void createChild() {
        Parent parent =familyTreeService.createParent("Xavier", FamilyTitle.Dad);
        familyTreeService.createChild("Zayden", Gender.Boy, parent);

        Assertions.assertThat(parent.getChildren().size()).isEqualTo(1);
        String childName = parent.getChildren().get(0).getName();

        Assertions.assertThat(childName).isEqualTo("Zayden");

    }



}
