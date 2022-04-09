import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormTest {

    @BeforeEach
    public void settingBrowserSize() {
        Configuration.browserSize = "2572x1620";
    }

    @DisplayName("Заполнение всех полей")
    @Test
    public void addAllFieldsTest() {
        open((String) StudentRegistrationFormPage.URL, StudentRegistrationFormPage.class)
                .checkPageAutomationPracticeFormLoaded()
                .zoomPage()
                .inputFirstName()
                .inputLastName()
                .inputEmail()
                .clickRadiobuttonGender()
                .inputMobile()
                .selectDateOfBirth()
                .inputSubjects()
                .checkboxHobbies()
                .clickUploadPicture()
                .inputCurrentAddress()
                .zoomPage()
                .clickState()
                .clickCity()
                .clickButtonSubmit()
                .checkPopupThanksForSubmittingLoaded();
    }

    @DisplayName("Заполнение только обязательных полей")
    @Test
    public void addRequiredFieldsTest() {
        open((String) StudentRegistrationFormPage.URL, StudentRegistrationFormPage.class)
                .checkPageAutomationPracticeFormLoaded()
                .zoomPage()
                .inputFirstName()
                .inputLastName()
                .clickRadiobuttonGender()
                .inputMobile()
                .clickButtonSubmit()
                .checkPopupThanksForSubmittingLoaded();
    }

    @DisplayName("Без заполнения обязательных полей")
    @Test
    public void addNotRequiredFieldsTest() {
        open((String) StudentRegistrationFormPage.URL, StudentRegistrationFormPage.class)
                .checkPageAutomationPracticeFormLoaded()
                .inputFirstName()
                .inputLastName()
                .clickButtonSubmitPageNotClose()
                .checkPageNotClose();
    }
}
