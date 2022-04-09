import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StudentRegistrationFormPage {

    private SelenideElement checkPageLoaded = $(".row");
    private SelenideElement inputFirstName = $("#firstName");
    private SelenideElement inputLastName = $("#lastName");
    private SelenideElement inputEmail = $("#userEmail");
    private SelenideElement clickRadiobuttonGender = $("#genterWrapper");
    private SelenideElement inputMobile = $("#userNumber");
    private SelenideElement selectDateOfBirth = $("#dateOfBirthInput");
    private SelenideElement clickMonth = $(".react-datepicker__month-select");
    private SelenideElement clickYear = $(".react-datepicker__year-select");
    private SelenideElement clickDay = $(".react-datepicker__day--026");
    private SelenideElement inputSubjects = $("#subjectsInput");
    private SelenideElement clickCheckboxHobbies = $("#hobbiesWrapper");
    private SelenideElement clickUploadPicture = $("#uploadPicture");
    private SelenideElement inputCurrentAddress = $("#currentAddress");
    private SelenideElement clickState = $("#state");
    private SelenideElement clickCity = $("#city");
    private SelenideElement clickButtonSubmit = $("#submit");

    protected static final Object URL = "https://demoqa.com/automation-practice-form";

    public StudentRegistrationFormPage checkPageAutomationPracticeFormLoaded() {
        checkPageLoaded.shouldBe(visible);
        return this;
    }

    public StudentRegistrationFormPage inputFirstName() {
        inputFirstName.setValue("text");
        return this;
    }

    public StudentRegistrationFormPage inputLastName() {
        inputLastName.setValue("text");
        return this;
    }

    public StudentRegistrationFormPage inputEmail() {
        inputEmail.setValue("test@gmail.com");
        return this;
    }

    public StudentRegistrationFormPage clickRadiobuttonGender() {
        clickRadiobuttonGender.find(byText("Male")).click();
        return this;
    }

    public StudentRegistrationFormPage inputMobile() {
        inputMobile.setValue("1234567890");
        return this;
    }

    public StudentRegistrationFormPage selectDateOfBirth() {
        selectDateOfBirth.click();
        clickMonth.find(byText("March")).click();
        clickYear.find(byText("2000")).click();
        clickDay.click();
        return this;
    }

    public StudentRegistrationFormPage inputSubjects() {
        inputSubjects.click();
        inputSubjects.setValue("E").pressEnter();
        return this;
    }

    public StudentRegistrationFormPage checkboxHobbies() {
        clickCheckboxHobbies.find(byText("Sports")).click();
        return this;
    }

    public StudentRegistrationFormPage clickUploadPicture() {
        clickUploadPicture.uploadFromClasspath("imagefortest.jpeg");
        return this;
    }

    public StudentRegistrationFormPage inputCurrentAddress() {
        inputCurrentAddress.setValue("text");
        return this;
    }

    public StudentRegistrationFormPage clickState() {
        clickState.click();
        $(byText("NCR")).click();
        return this;
    }

    public StudentRegistrationFormPage zoomPage() {
        Selenide.zoom(0.75);
        return this;
    }

    public StudentRegistrationFormPage clickCity() {
        clickCity.click();
        $(byText("Noida")).click();
        return this;
    }

    public ThanksForSubmittingLoadedPopup clickButtonSubmit() {
        clickButtonSubmit.click();
        return new ThanksForSubmittingLoadedPopup();
    }

    public StudentRegistrationFormPage clickButtonSubmitPageNotClose() {
        clickButtonSubmit.click();
        return this;
    }

    public StudentRegistrationFormPage checkPageNotClose() {
        checkPageLoaded.shouldBe(visible);
        return this;
    }
}
