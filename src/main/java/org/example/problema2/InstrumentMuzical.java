package org.example.problema2;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Set;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class InstrumentMuzical {
   protected   String producator;
   protected double pret;
 public static Set<InstrumentMuzical> setFromJson(String filePath)
 {

     try{
         File file = new File(filePath);
         ObjectMapper mapper = new ObjectMapper();
         mapper.activateDefaultTyping(mapper.getPolymorphicTypeValidator());
         var val = mapper.readValue(file, new TypeReference<Set<InstrumentMuzical>>() {
         });
         return val;

     }catch (IOException e)
     {
         e.printStackTrace();
     }
     return null;

 }
 public static void setToJson(String filePath,Set<InstrumentMuzical>instrumente)
 {
     try
     {
         File file = new File(filePath);
         ObjectMapper mapper = new ObjectMapper();
         mapper.activateDefaultTyping(mapper.getPolymorphicTypeValidator());
         mapper.writeValue(file,instrumente);
     }catch (IOException e)
     {
         e.printStackTrace();
     }
 }

    public InstrumentMuzical(String producator, double pret) {
        this.producator = producator;
        this.pret = pret;
    }

    public String getProducator() {
        return producator;
    }

    public double getPret() {
        return pret;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
