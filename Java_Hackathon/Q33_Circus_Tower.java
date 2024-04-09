package Java_Hackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q33_Circus_Tower {
	  static class Person implements Comparable<Person> {
	        int height;
	        int weight;
	        
	        public Person(int height, int weight) {
	            this.height = height;
	            this.weight = weight;
	        }
	        
	        @Override
	        public int compareTo(Person other) {
	            if (this.height == other.height) {
	                return Integer.compare(this.weight, other.weight);
	            }
	            return Integer.compare(this.height, other.height);
	        }
	        
	        @Override
	        public String toString() {
	            return "(" + height + ", " + weight + ")";
	        }
	    }
	    
	    public static List<Person> longestTower(List<Person> people) {
	        if (people == null || people.isEmpty()) {
	            return new ArrayList<>();
	        }
	        
	        // Sort people by height
	        Collections.sort(people);
	        
	        // Dynamic programming table to store the length of longest tower ending at each person
	        int[] dp = new int[people.size()];
	        Arrays.fill(dp, 1);
	        int[] prev = new int[people.size()];
	        Arrays.fill(prev, -1);
	        
	        int maxLength = 1;
	        int lastIndex = 0;
	        
	        // Compute the longest increasing subsequence
	        for (int i = 1; i < people.size(); i++) {
	            for (int j = 0; j < i; j++) {
	                if (people.get(i).weight > people.get(j).weight && dp[i] < dp[j] + 1) {
	                    dp[i] = dp[j] + 1;
	                    prev[i] = j;
	                }
	            }
	            if (dp[i] > maxLength) {
	                maxLength = dp[i];
	                lastIndex = i;
	            }
	        }
	        
	        // Reconstruct the longest tower
	        List<Person> tower = new ArrayList<>();
	        while (lastIndex != -1) {
	            tower.add(people.get(lastIndex));
	            lastIndex = prev[lastIndex];
	        }
	        
	        Collections.reverse(tower);
	        return tower;
	    }
	    
	    public static void main(String[] args) {
	        List<Person> people = new ArrayList<>();
	        people.add(new Person(65, 100));
	        people.add(new Person(70, 150));
	        people.add(new Person(56, 90));
	        people.add(new Person(75, 190));
	        people.add(new Person(60, 95));
	        people.add(new Person(68, 110));
	        
	        List<Person> longestTower = longestTower(people);
	        System.out.println("The longest tower is length " + longestTower.size() + " and includes from top to bottom:");
	        for (Person person : longestTower) {
	            System.out.println(person);
	        }
	    }
	}


