package com.dh.dentista;

public interface IDao <T>{
    public T cadastrarDentista(T t);
    public T atualizarDentista(Integer id, String matricula);
    public T consultarDentistas();
}
