package br.ufes.crud.presenter;

import br.ufes.crud.view.PrincipalView;

public class PrincipalPresenter {
    public static void main(String[] args) {
        PrincipalView view = new PrincipalView();
        new ListarPresenter(view);
    }
}
