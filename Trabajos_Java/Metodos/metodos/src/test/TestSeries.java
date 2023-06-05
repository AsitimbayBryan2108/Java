package test;

import metodos.Series;

public class TestSeries 
{
    public static void main(String[] args)
    {
        int n=7;


        String cadenas = Series.serieFibonacci(244);
        System.out.println("SerieFibonacci:"+ cadenas);
        
        String otraCadena=Series.serieUlam(n);
        System.out.println("SerieUlam:"+ otraCadena);

    }

    
}
