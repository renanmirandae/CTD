package com.dh.paciente.daoPattern;

public interface IDao<T>{
    public T cadastrar(T t);
    public T buscar(Integer id);
    public T excluir(T t);
    public T atualizar(T t);
}
