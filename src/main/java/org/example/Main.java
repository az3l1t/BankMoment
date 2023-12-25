package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] list;
        list = new String[]{"3:1", "2:2", "0:1", "4:2", "3:a", "3- 12"};
        Map<String,Integer> hash_map = new HashMap<>();
        for(String result : list) {
            String[] list_no_points = result.split(":");
            if(list_no_points.length==2){
                try{
                    int first_score = Integer.parseInt(list_no_points[0].trim());
                    int second_score = Integer.parseInt(list_no_points[1].trim());
                    if(first_score>second_score){
                        hash_map.put("Команда 1",hash_map.getOrDefault("Команда 1",0)+3);
                        hash_map.put("Команда 2",hash_map.getOrDefault("Команда 2",0));
                    }else if(first_score<second_score){
                        hash_map.put("Команда 1",hash_map.getOrDefault("Команда 1",0));
                        hash_map.put("Команда 2",hash_map.getOrDefault("Команда 2",0)+3);
                    }
                    else{
                        hash_map.put("Команда 1",hash_map.getOrDefault("Команда 1",0)+1);
                        hash_map.put("Команда 2",hash_map.getOrDefault("Команда 2",0)+1);
                    }
                }catch (NumberFormatException e){
                    System.out.println("NumberFormatException: " + result);
                }
            }
            else{
                System.out.println("Некорректный формат результата: " + result);
            }
        }
        for (Map.Entry<String, Integer> entry : hash_map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " очков");
        }

    }
}