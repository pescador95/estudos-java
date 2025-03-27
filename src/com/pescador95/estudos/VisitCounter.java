//package com.pescador95.estudos;
//import java.util.*;
//
//class VisitCounter {
//
//
//    public static void main(String[] args) {
//
//    }
//
//    public Map<Long, Long> count(Map<String, UserStats>... visits) {
//        if (visits == null) return Collections.emptyMap();
//
//        Map<Long, Long> result = new HashMap<>();
//        for (Map<String, UserStats> visit : visits) {
//            if (visit == null) continue;
//            for (Map.Entry<String, UserStats> entry : visit.entrySet()) {
//                try {
//                    Long userId = Long.parseLong(entry.getKey());
//                    if (entry.getValue() != null && entry.getValue().getVisitCount().isPresent()) {
//                        result.put(userId, result.getOrDefault(userId, 0L) + entry.getValue().getVisitCount().get());
//                    }
//                } catch (NumberFormatException e) {
//
//                }
//            }
//        }
//        return result;
//    }
//
//    public class UserStats {
//        int visitCount;
//
//        public int getVisitCount() {
//            return visitCount;
//        }
//
//        public boolean isPresent() {
//            return false;
//        }
//
//    }
//}
