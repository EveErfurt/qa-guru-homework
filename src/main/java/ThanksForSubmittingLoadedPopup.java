import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ThanksForSubmittingLoadedPopup {

    private SelenideElement checkPopupThanksForSubmittingLoaded = $("#closeLargeModal");

    public ThanksForSubmittingLoadedPopup checkPopupThanksForSubmittingLoaded() {
        checkPopupThanksForSubmittingLoaded.shouldBe(visible);
        return this;
    }
}
