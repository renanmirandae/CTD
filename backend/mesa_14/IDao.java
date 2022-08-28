package mesa_14;

public interface IDao <T>{
    public T salvar(T t);
    public T buscar(Integer id);
}
