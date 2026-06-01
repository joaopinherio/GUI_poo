package br.pucrs.edu.paula25.joao.exemplo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
@Route("")
public class MainView extends VerticalLayout {
 public MainView() {
 TextField campoNome = new TextField("Entre o seu nome");
 Button botaoOk = new Button("Ok");
 TextField campoMensagem = new TextField("Mensagem");
 add(campoNome, botaoOk, campoMensagem);
 botaoOk.addClickListener(event -> {
 String texto = campoNome.getValue();
 campoMensagem.setValue("Ola', "+texto+"!!!");
 });
 }
}