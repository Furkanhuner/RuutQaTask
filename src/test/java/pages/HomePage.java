package pages;

import org.openqa.selenium.By;

public class HomePage {
    public static final By APPLY_BUTTON=By.xpath("//a[normalize-space(text())='Başvur']");
    public static final By SURUCU = By.xpath("//label[normalize-space(text())='Sürücü']");
    public static final By MOTORCU = By.xpath("//label[normalize-space(text())='Motorcu']");
    public static final By REKLAMCI = By.xpath("//label[normalize-space(text())='Reklamcı']");
    public static final By EKRAN_YATIRIMCISI = By.xpath("//label[normalize-space(text())='Ekran Yatırımcısı']");
}
