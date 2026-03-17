package aula04;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLaboratorio {
    List<ItemLaboratorio>lista;
    public EstoqueLaboratorio(){
        lista = new ArrayList<>();
    }
    public void cadastrar(ItemLaboratorio item){
        if (item == null) throw new IllegalArgumentException();
        lista.add(item);
    }
    public ItemLaboratorio buscarPorCodigo(String codigo){
        for (ItemLaboratorio item : lista){
            if (item.getCodigo().equals(codigo)){
                return item;

            }
        }
        return null;
    }
    public List<ItemLaboratorio>listarEmAlerta(){
        List<ItemLaboratorio> resultado = new ArrayList<>();

        for (ItemLaboratorio i : lista){
            if (i.getStatus().equals("ALERTA") || i.getStatus().equals("ESGOTADO")){
                resultado.add(i);
            }
        }
        return resultado;
    }
}
