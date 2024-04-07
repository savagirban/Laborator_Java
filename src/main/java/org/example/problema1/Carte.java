package org.example.problema1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public record Carte(String titlul, String autorul, int anul) {
    public static Map<Integer,Carte> mapFromJson(String filePath){
        try {
            File file = new File(filePath);
            ObjectMapper mapper = new ObjectMapper();
            Map<Integer,Carte> carti = mapper.readValue(
                    file,
                    new TypeReference<Map<Integer,Carte>>() {
                    }
            );
            return carti;
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static void mapToJson(String filePath,Map<Integer,Carte>carti)
    {
        try {
            File file = new File(filePath);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file,carti
            );
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void showMap(Map<Integer, Carte> map)
    {
        map.forEach((k,v)->  System.out.println(k+" : "+v));
    }
}