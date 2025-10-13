package collections;

import java.io.*;
import java.util.*;

public class LogAnalyzer {

    // Class to store a visitor's page visit count
    static class VisitorData {
        String visitorId;
        Map<String, Integer> pageCountMap;

        VisitorData(String visitorId) {
            this.visitorId = visitorId;
            this.pageCountMap = new HashMap<>();
        }

        // Increment the visit count for a specific page ID
        void incrementPageVisit(String pageId) {
            pageCountMap.put(pageId, pageCountMap.getOrDefault(pageId, 0) + 1);
        }

        // Get the most visited page ID
        String getMostFrequentPage() {
            return Collections.max(pageCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        }

        int getVisitCountForPage(String pageId) {
            return pageCountMap.getOrDefault(pageId, 0);
        }
    }

    // Method to process a log file and analyze visitors
    public static void analyzeLogs(List<String> logFiles) {
        Map<String, VisitorData> visitorDataMap = new HashMap<>();

        // Loop through each log file
        for (String logFile : logFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Sample log entry format: "visitor_id, page_id, timestamp"
                    String[] logParts = line.split(",");
                    if (logParts.length != 3) continue;

                    String visitorId = logParts[0].trim();
                    String pageId = logParts[1].trim();

                    // Update visitor data
                    visitorDataMap.putIfAbsent(visitorId, new VisitorData(visitorId));
                    VisitorData visitorData = visitorDataMap.get(visitorId);
                    visitorData.incrementPageVisit(pageId);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Find the most frequent visitor and their most frequent page
        String mostFrequentVisitor = null;
        String mostFrequentPage = null;
        int maxVisits = 0;

        for (VisitorData visitorData : visitorDataMap.values()) {
            String frequentPage = visitorData.getMostFrequentPage();
            int visitCount = visitorData.getVisitCountForPage(frequentPage);

            if (visitCount > maxVisits) {
                maxVisits = visitCount;
                mostFrequentVisitor = visitorData.visitorId;
                mostFrequentPage = frequentPage;
            }
        }

        // Output the results
        System.out.println("Most Frequent Visitor: " + mostFrequentVisitor);
        System.out.println("Most Frequent Page ID: " + mostFrequentPage);
        System.out.println("Visit Count: " + maxVisits);
    }

    public static void main(String[] args) {
        List<String> logFiles = Arrays.asList("day1.log", "day2.log");  // List of log files
        analyzeLogs(logFiles);
    }
}
