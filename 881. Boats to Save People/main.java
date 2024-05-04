import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCount = 0;for (int lighter = 0, heavier = people.length - 1; lighter <= heavier; --heavier) {
            if (people[lighter] + people[heavier] <= limit) {
                lighter++;
            }
            boatCount++;
        }
        return boatCount;
    }
}