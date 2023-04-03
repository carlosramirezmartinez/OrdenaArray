import java.util.Arrays;
public class OrdenaArray
{
    public static void main(String[] args) {
        //Ver como mejora la distinccion de mayusculas, minusculas y numeros(como cadena tambien).
        String a[]={"Hola","Mundo","citrix","java","javaee","33","carlos","programacion","PHP","w3schools","99"};
        
        Arrays.sort(a);
        int b;
        for(b=0; b<a.length; b++){
        System.out.println(a[b]);
        }
        
    }
    
}