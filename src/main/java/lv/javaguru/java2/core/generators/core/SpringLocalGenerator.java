package lv.javaguru.java2.core.generators.core;

import com.sun.codemodel.JCodeModel;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import sun.reflect.Reflection;

import java.util.Set;

/**
 * Created by Aleksej_home on 2015.09.05..
 */
public class SpringLocalGenerator {
   // JCodeModel
    protected String mapPath = "lv.javaguru.java2.core.domain.frontend";
   // protected String mapPath = "domain";
    protected String sourcePath;
    protected String resources;
    protected JCodeModel __GENERATOR;
   // protected final JCodeModel __GENERATOR = new JCodeModel();

    public void SpringLocalGenerator(){}

    public Set<Class<? extends Object>> scannPackage(){
       // Reflections reflections = new Reflections("lv.javaguru.java2.core.domain");
        Reflections reflections = new Reflections("lv.javaguru.java2.core.domain", new SubTypesScanner(false));
     /*   for (String cl : reflections.getAllTypes()){
            System.out.println("[= "+ cl + "=]\n");
        }*/
        Set<Class<? extends Object>> allClasses =
                reflections.getSubTypesOf(Object.class);
        for (Class<? extends Object> cl : allClasses){
            System.out.println("[= "+ cl.getSimpleName() + "=]\n");
        }

     /*   Set<Class<? extends Object>> allClasses =
                reflections.getSubTypesOf(Object.class);
        return allClasses;*/
        return null;
    }

   /* public Set<?> getPackageFiles(){

        return null;
    }
*/
}
