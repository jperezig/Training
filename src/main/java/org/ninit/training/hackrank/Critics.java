package org.ninit.training.hackrank;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.ninit.training.utils.Utils;

public class Critics {

    // Compute combinations of two elements among critics
    // check if pair of critics are valid
    // choose from pairs, those with no common elements

    public static boolean areCompatible(Set<Integer> c1, Set<Integer> c2) {
        if (Math.abs(c1.size() - c2.size()) > 1) {
            return false;
        } else {
            int size = c1.size() > c2.size() ? c1.size() : c2.size();
            int coincidents = 0;
            for (Integer i : c1) {
                if (c2.contains(i)) {
                    coincidents++;
                }
            }
            return coincidents > size - 2;
        }
    }

    public static boolean isSolution(List<Set<Integer>> candidate) {
        Set<Integer> temp = new HashSet<Integer>();
        for (Set<Integer> n : candidate) {
            temp.addAll(n);
        }
        return temp.size() == candidate.size() * 2;
    }

    public static void getCombinations(int max, Set<Integer> temp,
            List<Set<Integer>> solution, int pos) {
        if (pos >= max) {
            return;
        }
        temp.add(pos);

        solution.add(new HashSet<>(temp));

        getCombinations(max, temp, solution, pos + 1);
        temp.remove(pos);
        getCombinations(max, temp, solution, pos + 1);

    }

    public static List<Set<Integer>> getCompatibleVCritics(
            List<Set<Integer>> critics) {
        List<Set<Integer>> compatibleCritics = new ArrayList<Set<Integer>>();
        for (int i = 0; i < critics.size(); i++) {
            for (int j = i + 1; j < critics.size(); j++) {
                if (areCompatible(critics.get(i), critics.get(j))) {
                    Set<Integer> set = new HashSet<Integer>();
                    set.add(i);
                    set.add(j);
                    compatibleCritics.add(set);
                }
            }

        }
        return compatibleCritics;
    }

    public static void solve(List<Set<Integer>> critics, PrintStream out) {
        critics = getCompatibleVCritics(critics);
        List<Set<Integer>> combinations = new ArrayList<Set<Integer>>();
        getCombinations(critics.size(), new HashSet<Integer>(), combinations, 0);
        int max = Integer.MIN_VALUE;
        List<Set<Integer>> solution = new ArrayList<Set<Integer>>();
        for (Set<Integer> s : combinations) {
            List<Set<Integer>> candidate = new ArrayList<Set<Integer>>();
            for (Integer i : s) {
                candidate.add(critics.get(i));
            }
            if (isSolution(candidate)) {
                if (candidate.size() > max) {
                    max = candidate.size();
                    solution = new ArrayList<Set<Integer>>();
                    solution.addAll(candidate);
                }
            }
        }
        out.println(solution.size());
        for (Set<Integer> s : solution) {
            int n = 0;
            for (Integer i : s) {
                out.print(i);
                if (n < 1) {
                    out.print(" ");
                }
                n++;
            }
            out.println();
        }

    }

    public static List<Set<Integer>> read(InputStream input) {
        Scanner sc = new Scanner(input);
        int numberOfCritics = sc.nextInt();
        sc.nextInt();
        List<Set<Integer>> critics = new ArrayList<Set<Integer>>();
        for (int i = 0; i < numberOfCritics; i++) {
            String line = "";
            while (line.trim().length() < 1) {
                line = sc.nextLine();
            }
            critics.add(Utils.toSet(line.trim().split(" ")));
        }
        sc.close();
        return critics;

    }

    public static void main(String[] args) {
        solve(read(System.in), System.out);
    }
}
