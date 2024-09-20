package org.example.levels;

import java.util.HashMap;
import java.util.Map;

public class LevelMapping {
    private static final Map<String, String> mapping = new HashMap<>();

    static {
        mapping.put("level_1", "C:\\Users\\arel_room\\IdeaProjects\\raycast-based-3D\\src\\main\\resources\\level_1.txt");
    }

    public static String get(String key) {
        return mapping.get(key);
    }

    public static void put(String key, String value) {
        mapping.put(key, value);
    }
}
