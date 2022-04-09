import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ThanksForSubmittingPopup {

    private SelenideElement checkPopupThanksForSubmittingLoaded = $("#closeLargeModal");

    public ThanksForSubmittingPopup checkPopupThanksForSubmittingLoaded() {
        checkPopupThanksForSubmittingLoaded.shouldBe(visible);
        return this;
    }
}
