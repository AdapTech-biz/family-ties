package xyd.progamming.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyd.programming.domain.Child;
import xyd.programming.domain.FamilyTitle;
import xyd.programming.domain.Gender;
import xyd.programming.domain.Parent;
import xyd.programming.service.FamilyTreeService;
import xyd.programming.service.FamilyTreeServiceImpl;

import java.util.List;

@SpringBootTest(classes = FamilyTreeServiceImpl.class)
public class FamilyTreeServiceTest {

    private static FamilyTreeService familyTreeService;

    @BeforeAll
    public static void beforeAll() {
        familyTreeService = new FamilyTreeServiceImpl();
    }


    @Test
    void createParent() {
        Parent parent = familyTreeService.createParent("Xavier", FamilyTitle.Dad);
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

    @Test
    void createChildWithMultipleParents() {
        Parent dad =familyTreeService.createParent("Xavier", FamilyTitle.Dad);
        Parent mom =familyTreeService.createParent("Cari", FamilyTitle.Mom);
        familyTreeService.createChild("Yarnell", Gender.Boy, dad, mom);

        Child child = dad.getChildren().get(0);

        Assertions.assertThat(child.getParents().size()).isEqualTo(2);

    }

    @Test
    void addPartnerToParent() {
        Parent dad =familyTreeService.createParent("Xavier", FamilyTitle.Dad);
        Parent mom =familyTreeService.createParent("Cari", FamilyTitle.Mom);

        familyTreeService.setParentPartner(mom, dad);

        Assertions.assertThat(dad.getPartner().equals(mom)).isTrue();
    }



}
