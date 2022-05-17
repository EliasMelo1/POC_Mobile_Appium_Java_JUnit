package com.CIandT.appium.pageFactory.elements;

import com.CIandT.appium.pageFactory.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Getter;

@Getter
public class LoginElement extends BasePage {
    @iOSXCUITFindBy(id = "idIOS")
    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    private MobileElement botaoCadastro;
}
