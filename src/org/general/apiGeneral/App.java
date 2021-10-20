package org.general.apiGeneral;

import org.json.simple.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONObject js = new JSONObject();
    
        
        Aluno a = new Aluno();
        a.setNome("ruan");
        a.setIdade(15);
        a.setEstaBem(true);
        
        js.put("nome", a.getNome());
        js.put("idade", a.getIdade());
        js.put("estaBem", a.isEstaBem());
        
        System.out.println(js);
        Aluno b = new Aluno(js);
        System.out.println(b);
    
    }
}
